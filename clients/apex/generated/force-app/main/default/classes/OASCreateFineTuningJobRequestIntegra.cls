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
 * OASCreateFineTuningJobRequestIntegra
 */
public class OASCreateFineTuningJobRequestIntegra {
    /**
     * Get type
     * @return type
     */
    public OASCreateFineTuningJobRequestIntegra type { get; set; }

    /**
     * Get wandb
     * @return wandb
     */
    public OASCreateFineTuningJobRequestIntegra wandb { get; set; }

    public static OASCreateFineTuningJobRequestIntegra getExample() {
        OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner = new OASCreateFineTuningJobRequestIntegra();
          createFineTuningJobRequestIntegrationsInner.type = OASCreateFineTuningJobRequestIntegra.getExample();
          createFineTuningJobRequestIntegrationsInner.wandb = OASCreateFineTuningJobRequestIntegra.getExample();
        return createFineTuningJobRequestIntegrationsInner;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateFineTuningJobRequestIntegra) {           
            OASCreateFineTuningJobRequestIntegra createFineTuningJobRequestIntegrationsInner = (OASCreateFineTuningJobRequestIntegra) obj;
            return this.type == createFineTuningJobRequestIntegrationsInner.type
                && this.wandb == createFineTuningJobRequestIntegrationsInner.wandb;
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

