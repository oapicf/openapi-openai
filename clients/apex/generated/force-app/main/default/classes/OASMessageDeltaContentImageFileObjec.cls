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
 * OASMessageDeltaContentImageFileObjec
 */
public class OASMessageDeltaContentImageFileObjec implements OAS.MappedProperties {
    /**
     * The [File](/docs/api-reference/files) ID of the image in the message content.
     * @return fileId
     */
    public String fileId { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'file_id' => 'fileId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASMessageDeltaContentImageFileObjec getExample() {
        OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile = new OASMessageDeltaContentImageFileObjec();
          messageDeltaContentImageFileObjectImageFile.fileId = '';
        return messageDeltaContentImageFileObjectImageFile;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMessageDeltaContentImageFileObjec) {           
            OASMessageDeltaContentImageFileObjec messageDeltaContentImageFileObjectImageFile = (OASMessageDeltaContentImageFileObjec) obj;
            return this.fileId == messageDeltaContentImageFileObjectImageFile.fileId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (fileId == null ? 0 : System.hashCode(fileId));
        return hashCode;
    }
}
