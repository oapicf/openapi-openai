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
 * OASFineTuningIntegration
 */
public class OASFineTuningIntegration {
    /**
     * The type of the integration being enabled for the fine-tuning job
     */
    public enum TypeEnum {
        WANDB
    }

    /**
     * The type of the integration being enabled for the fine-tuning job
     * @return type
     */
    public TypeEnum type { get; set; }

    /**
     * Get wandb
     * @return wandb
     */
    public OASCreateFineTuningJobRequestIntegra wandb { get; set; }

    public static OASFineTuningIntegration getExample() {
        OASFineTuningIntegration fineTuningIntegration = new OASFineTuningIntegration();
          fineTuningIntegration.type = TypeEnum.WANDB;
          fineTuningIntegration.wandb = OASCreateFineTuningJobRequestIntegra.getExample();
        return fineTuningIntegration;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASFineTuningIntegration) {           
            OASFineTuningIntegration fineTuningIntegration = (OASFineTuningIntegration) obj;
            return this.type == fineTuningIntegration.type
                && this.wandb == fineTuningIntegration.wandb;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (type == null ? 0 : System.hashCode(type));
        hashCode = (17 * hashCode) + (wandb == null ? 0 : System.hashCode(wandb));
        return hashCode;
    }
}

