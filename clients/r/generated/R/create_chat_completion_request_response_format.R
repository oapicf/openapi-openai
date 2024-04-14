#' Create a new CreateChatCompletionRequestResponseFormat
#'
#' @description
#' An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
#'
#' @docType class
#' @title CreateChatCompletionRequestResponseFormat
#' @description CreateChatCompletionRequestResponseFormat Class
#' @format An \code{R6Class} generator object
#' @field type Must be one of `text` or `json_object`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionRequestResponseFormat <- R6::R6Class(
  "CreateChatCompletionRequestResponseFormat",
  public = list(
    `type` = NULL,
    #' Initialize a new CreateChatCompletionRequestResponseFormat class.
    #'
    #' @description
    #' Initialize a new CreateChatCompletionRequestResponseFormat class.
    #'
    #' @param type Must be one of `text` or `json_object`.. Default to "text".
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type` = "text", ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("text", "json_object"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"text\", \"json_object\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionRequestResponseFormat in JSON format
    #' @export
    toJSON = function() {
      CreateChatCompletionRequestResponseFormatObject <- list()
      if (!is.null(self$`type`)) {
        CreateChatCompletionRequestResponseFormatObject[["type"]] <-
          self$`type`
      }
      CreateChatCompletionRequestResponseFormatObject
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionRequestResponseFormat
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionRequestResponseFormat
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionRequestResponseFormat
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text", "json_object"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\", \"json_object\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionRequestResponseFormat in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionRequestResponseFormat
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionRequestResponseFormat
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionRequestResponseFormat
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text", "json_object"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\", \"json_object\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self
    },
    #' Validate JSON input with respect to CreateChatCompletionRequestResponseFormat
    #'
    #' @description
    #' Validate JSON input with respect to CreateChatCompletionRequestResponseFormat and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatCompletionRequestResponseFormat
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateChatCompletionRequestResponseFormat$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionRequestResponseFormat$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionRequestResponseFormat$lock()

