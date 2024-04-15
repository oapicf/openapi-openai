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
 * OASMessageDeltaContentTextObjectText
 */
public class OASMessageDeltaContentTextObjectText {
    /**
     * The data that makes up the text.
     * @return value
     */
    public String value { get; set; }

    /**
     * Get annotations
     * @return annotations
     */
    public List<OASMessageDeltaContentTextObjectText> annotations { get; set; }

    public OASMessageDeltaContentTextObjectText() {
        annotations = new List<OASMessageDeltaContentTextObjectText>();
    }

    public static OASMessageDeltaContentTextObjectText getExample() {
        OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText = new OASMessageDeltaContentTextObjectText();
          messageDeltaContentTextObjectText.value = '';
          messageDeltaContentTextObjectText.annotations = new List<OASMessageDeltaContentTextObjectText>{OASMessageDeltaContentTextObjectText.getExample()};
        return messageDeltaContentTextObjectText;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMessageDeltaContentTextObjectText) {           
            OASMessageDeltaContentTextObjectText messageDeltaContentTextObjectText = (OASMessageDeltaContentTextObjectText) obj;
            return this.value == messageDeltaContentTextObjectText.value
                && this.annotations == messageDeltaContentTextObjectText.annotations;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (value == null ? 0 : System.hashCode(value));
        hashCode = (17 * hashCode) + (annotations == null ? 0 : System.hashCode(annotations));
        return hashCode;
    }
}
