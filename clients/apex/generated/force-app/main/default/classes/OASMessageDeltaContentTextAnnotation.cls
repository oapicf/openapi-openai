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
 * OASMessageDeltaContentTextAnnotation
 */
public class OASMessageDeltaContentTextAnnotation implements OAS.MappedProperties {
    /**
     * The ID of the file that was generated.
     * @return fileId
     */
    public String fileId { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'file_id' => 'fileId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASMessageDeltaContentTextAnnotation getExample() {
        OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath = new OASMessageDeltaContentTextAnnotation();
          messageDeltaContentTextAnnotationsFilePathObjectFilePath.fileId = '';
        return messageDeltaContentTextAnnotationsFilePathObjectFilePath;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMessageDeltaContentTextAnnotation) {           
            OASMessageDeltaContentTextAnnotation messageDeltaContentTextAnnotationsFilePathObjectFilePath = (OASMessageDeltaContentTextAnnotation) obj;
            return this.fileId == messageDeltaContentTextAnnotationsFilePathObjectFilePath.fileId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (fileId == null ? 0 : System.hashCode(fileId));
        return hashCode;
    }
}
