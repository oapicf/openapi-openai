#' Create a new CreateAssistantFileRequest
#'
#' @description
#' CreateAssistantFileRequest Class
#'
#' @docType class
#' @title CreateAssistantFileRequest
#' @description CreateAssistantFileRequest Class
#' @format An \code{R6Class} generator object
#' @field file_id A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssistantFileRequest <- R6::R6Class(
  "CreateAssistantFileRequest",
  public = list(
    `file_id` = NULL,

    #' @description
    #' Initialize a new CreateAssistantFileRequest class.
    #'
    #' @param file_id A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
    #' @param ... Other optional arguments.
    initialize = function(`file_id`, ...) {
      if (!missing(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssistantFileRequest in JSON format
    toJSON = function() {
      CreateAssistantFileRequestObject <- list()
      if (!is.null(self$`file_id`)) {
        CreateAssistantFileRequestObject[["file_id"]] <-
          self$`file_id`
      }
      CreateAssistantFileRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssistantFileRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssistantFileRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_id`)) {
        self$`file_id` <- this_object$`file_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssistantFileRequest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`file_id`)) {
          sprintf(
          '"file_id":
            "%s"
                    ',
          self$`file_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssistantFileRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssistantFileRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssistantFileRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `file_id`
      if (!is.null(input_json$`file_id`)) {
        if (!(is.character(input_json$`file_id`) && length(input_json$`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", input_json$`file_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateAssistantFileRequest: the required field `file_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssistantFileRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `file_id` is null
      if (is.null(self$`file_id`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `file_id` is null
      if (is.null(self$`file_id`)) {
        invalid_fields["file_id"] <- "Non-nullable required field `file_id` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateAssistantFileRequest$unlock()
#
## Below is an example to define the print function
# CreateAssistantFileRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssistantFileRequest$lock()

