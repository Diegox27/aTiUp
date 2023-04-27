/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.edit.EditChoice;
import com.theokanning.openai.edit.EditRequest;
import java.util.List;

public class ConexionChatGPT {
    public static String conexion(String pregunta) {
        
    OpenAiService service = new OpenAiService("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");

    EditRequest request = EditRequest.builder()
            .model("text-davinci-edit-001")
            .input(pregunta)
            .instruction("Responder pregunta y explicar")
            .build();
    String respuesta = "";
    List<EditChoice> choices = service.createEdit(request).getChoices();
   /* for (EditChoice choice : choices) {
        respuesta += choice.getText() + "\n";
    }
    return respuesta;*/
      return choices.get(0).getText(); // Devuelve solo la primera respuesta generada por ChatGPT
    }
    
     
}
