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
 * The text content that is part of a message.
 */
public class OASMessageContentTextObject {
    /**
     * Always `text`.
     */
    public enum TypeEnum {
        TEXT
    }

    /**
     * Always `text`.
     * @return type
     */
    public TypeEnum type { get; set; }

    /**
     * Get text
     * @return text
     */
    public OASMessageContentTextObjectText text { get; set; }

    public static OASMessageContentTextObject getExample() {
        OASMessageContentTextObject messageContentTextObject = new OASMessageContentTextObject();
          messageContentTextObject.type = TypeEnum.TEXT;
          messageContentTextObject.text = OASMessageContentTextObjectText.getExample();
        return messageContentTextObject;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMessageContentTextObject) {           
            OASMessageContentTextObject messageContentTextObject = (OASMessageContentTextObject) obj;
            return this.type == messageContentTextObject.type
                && this.text == messageContentTextObject.text;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (type == null ? 0 : System.hashCode(type));
        hashCode = (17 * hashCode) + (text == null ? 0 : System.hashCode(text));
        return hashCode;
    }
}

