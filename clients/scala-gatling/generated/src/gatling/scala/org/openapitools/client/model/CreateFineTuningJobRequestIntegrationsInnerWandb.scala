
package org.openapitools.client.model


case class CreateFineTuningJobRequestIntegrationsInnerWandb (
    /* The name of the project that the new run will be created under.  */
    _project: String,
    /* A display name to set for the run. If not set, we will use the Job ID as the name.  */
    _name: Option[String],
    /* The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used.  */
    _entity: Option[String],
    /* A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\".  */
    _tags: Option[List[String]]
)
object CreateFineTuningJobRequestIntegrationsInnerWandb {
    def toStringBody(var_project: Object, var_name: Object, var_entity: Object, var_tags: Object) =
        s"""
        | {
        | "project":$var_project,"name":$var_name,"entity":$var_entity,"tags":$var_tags
        | }
        """.stripMargin
}