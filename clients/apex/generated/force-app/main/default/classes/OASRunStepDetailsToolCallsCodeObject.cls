/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * The Code Interpreter tool call definition.
 */
public class OASRunStepDetailsToolCallsCodeObject {
    /**
     * The input to the Code Interpreter tool call.
     * @return input
     */
    public String input { get; set; }

    /**
     * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
     * @return outputs
     */
    public List<OASRunStepDetailsToolCallsCodeObject> outputs { get; set; }

    public OASRunStepDetailsToolCallsCodeObject() {
        outputs = new List<OASRunStepDetailsToolCallsCodeObject>();
    }

    public static OASRunStepDetailsToolCallsCodeObject getExample() {
        OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter = new OASRunStepDetailsToolCallsCodeObject();
          runStepDetailsToolCallsCodeObjectCodeInterpreter.input = '';
          runStepDetailsToolCallsCodeObjectCodeInterpreter.outputs = new List<OASRunStepDetailsToolCallsCodeObject>{OASRunStepDetailsToolCallsCodeObject.getExample()};
        return runStepDetailsToolCallsCodeObjectCodeInterpreter;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunStepDetailsToolCallsCodeObject) {           
            OASRunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObjectCodeInterpreter = (OASRunStepDetailsToolCallsCodeObject) obj;
            return this.input == runStepDetailsToolCallsCodeObjectCodeInterpreter.input
                && this.outputs == runStepDetailsToolCallsCodeObjectCodeInterpreter.outputs;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (input == null ? 0 : System.hashCode(input));
        hashCode = (17 * hashCode) + (outputs == null ? 0 : System.hashCode(outputs));
        return hashCode;
    }
}
