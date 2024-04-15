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
 * The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
 */
public class OASCreateRunRequestModel {
    public static OASCreateRunRequestModel getExample() {
        OASCreateRunRequestModel createRunRequestModel = new OASCreateRunRequestModel();
        return createRunRequestModel;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateRunRequestModel) {           
                return true;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        return hashCode;
    }
}
