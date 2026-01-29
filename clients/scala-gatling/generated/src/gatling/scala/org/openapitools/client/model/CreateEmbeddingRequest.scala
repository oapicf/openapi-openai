
package org.openapitools.client.model


case class CreateEmbeddingRequest (
    _input: CreateEmbeddingRequestInput,
    _model: CreateEmbeddingRequestModel,
    /* The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/). */
    _encodingFormat: Option[String],
    /* The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.  */
    _dimensions: Option[Integer],
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    _user: Option[String]
)
object CreateEmbeddingRequest {
    def toStringBody(var_input: Object, var_model: Object, var_encodingFormat: Object, var_dimensions: Object, var_user: Object) =
        s"""
        | {
        | "input":$var_input,"model":$var_model,"encodingFormat":$var_encodingFormat,"dimensions":$var_dimensions,"user":$var_user
        | }
        """.stripMargin
}
