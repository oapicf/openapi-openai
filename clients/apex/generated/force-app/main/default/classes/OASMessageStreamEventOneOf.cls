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
 * Occurs when a [message](/docs/api-reference/messages/object) is created.
 */
public class OASMessageStreamEventOneOf {
    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        THREAD_MESSAGE_CREATED
    }

    /**
     * Get event
     * @return event
     */
    public EventEnum event { get; set; }

    /**
     * Get data
     * @return data
     */
    public OASMessageObject data { get; set; }

    public static OASMessageStreamEventOneOf getExample() {
        OASMessageStreamEventOneOf messageStreamEventOneOf = new OASMessageStreamEventOneOf();
          messageStreamEventOneOf.event = EventEnum.THREAD_MESSAGE_CREATED;
          messageStreamEventOneOf.data = OASMessageObject.getExample();
        return messageStreamEventOneOf;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMessageStreamEventOneOf) {           
            OASMessageStreamEventOneOf messageStreamEventOneOf = (OASMessageStreamEventOneOf) obj;
            return this.event == messageStreamEventOneOf.event
                && this.data == messageStreamEventOneOf.data;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (event == null ? 0 : System.hashCode(event));
        hashCode = (17 * hashCode) + (data == null ? 0 : System.hashCode(data));
        return hashCode;
    }
}
