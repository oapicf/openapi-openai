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
 * OASRunStepDetailsToolCallsRetrievalO
 */
public class OASRunStepDetailsToolCallsRetrievalO {
    /**
     * The ID of the tool call object.
     * @return id
     */
    public String id { get; set; }

    /**
     * The type of tool call. This is always going to be `retrieval` for this type of tool call.
     */
    public enum TypeEnum {
        RETRIEVAL
    }

    /**
     * The type of tool call. This is always going to be `retrieval` for this type of tool call.
     * @return type
     */
    public TypeEnum type { get; set; }

    /**
     * For now, this is always going to be an empty object.
     * @return retrieval
     */
    public Object retrieval { get; set; }

    public static OASRunStepDetailsToolCallsRetrievalO getExample() {
        OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject = new OASRunStepDetailsToolCallsRetrievalO();
          runStepDetailsToolCallsRetrievalObject.id = '';
          runStepDetailsToolCallsRetrievalObject.type = TypeEnum.RETRIEVAL;
          runStepDetailsToolCallsRetrievalObject.retrieval = null;
        return runStepDetailsToolCallsRetrievalObject;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunStepDetailsToolCallsRetrievalO) {           
            OASRunStepDetailsToolCallsRetrievalO runStepDetailsToolCallsRetrievalObject = (OASRunStepDetailsToolCallsRetrievalO) obj;
            return this.id == runStepDetailsToolCallsRetrievalObject.id
                && this.type == runStepDetailsToolCallsRetrievalObject.type
                && this.retrieval == runStepDetailsToolCallsRetrievalObject.retrieval;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (type == null ? 0 : System.hashCode(type));
        hashCode = (17 * hashCode) + (retrieval == null ? 0 : System.hashCode(retrieval));
        return hashCode;
    }
}
