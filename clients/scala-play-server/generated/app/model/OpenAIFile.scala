package model

import play.api.libs.json._

/**
  * The `File` object represents a document that has been uploaded to OpenAI.
  * @param id The file identifier, which can be referenced in the API endpoints.
  * @param bytes The size of the file, in bytes.
  * @param createdAt The Unix timestamp (in seconds) for when the file was created.
  * @param filename The name of the file.
  * @param `object` The object type, which is always `file`.
  * @param purpose The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
  * @param status Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
  * @param statusDetails Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class OpenAIFile(
  id: String,
  bytes: Int,
  createdAt: Int,
  filename: String,
  `object`: OpenAIFile.Object.Value,
  purpose: OpenAIFile.Purpose.Value,
  status: OpenAIFile.Status.Value,
  statusDetails: Option[String]
)

object OpenAIFile {
  implicit lazy val openAIFileJsonFormat: Format[OpenAIFile] = Json.format[OpenAIFile]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val File = Value("file")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Purpose extends Enumeration {
    val FineTune = Value("fine-tune")
    val FineTuneResults = Value("fine-tune-results")
    val Assistants = Value("assistants")
    val AssistantsOutput = Value("assistants_output")

    type Purpose = Value
    implicit lazy val PurposeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val Uploaded = Value("uploaded")
    val Processed = Value("processed")
    val Error = Value("error")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

