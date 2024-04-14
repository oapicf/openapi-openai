#' Create a new MessageContentTextAnnotationsFilePathObjectFilePath
#'
#' @description
#' MessageContentTextAnnotationsFilePathObjectFilePath Class
#'
#' @docType class
#' @title MessageContentTextAnnotationsFilePathObjectFilePath
#' @description MessageContentTextAnnotationsFilePathObjectFilePath Class
#' @format An \code{R6Class} generator object
#' @field file_id The ID of the file that was generated. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageContentTextAnnotationsFilePathObjectFilePath <- R6::R6Class(
  "MessageContentTextAnnotationsFilePathObjectFilePath",
  public = list(
    `file_id` = NULL,
    #' Initialize a new MessageContentTextAnnotationsFilePathObjectFilePath class.
    #'
    #' @description
    #' Initialize a new MessageContentTextAnnotationsFilePathObjectFilePath class.
    #'
    #' @param file_id The ID of the file that was generated.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`file_id`, ...) {
      if (!missing(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageContentTextAnnotationsFilePathObjectFilePath in JSON format
    #' @export
    toJSON = function() {
      MessageContentTextAnnotationsFilePathObjectFilePathObject <- list()
      if (!is.null(self$`file_id`)) {
        MessageContentTextAnnotationsFilePathObjectFilePathObject[["file_id"]] <-
          self$`file_id`
      }
      MessageContentTextAnnotationsFilePathObjectFilePathObject
    },
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFilePathObjectFilePath
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFilePathObjectFilePath
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextAnnotationsFilePathObjectFilePath
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_id`)) {
        self$`file_id` <- this_object$`file_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageContentTextAnnotationsFilePathObjectFilePath in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFilePathObjectFilePath
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFilePathObjectFilePath
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextAnnotationsFilePathObjectFilePath
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self
    },
    #' Validate JSON input with respect to MessageContentTextAnnotationsFilePathObjectFilePath
    #'
    #' @description
    #' Validate JSON input with respect to MessageContentTextAnnotationsFilePathObjectFilePath and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `file_id`
      if (!is.null(input_json$`file_id`)) {
        if (!(is.character(input_json$`file_id`) && length(input_json$`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", input_json$`file_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextAnnotationsFilePathObjectFilePath: the required field `file_id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageContentTextAnnotationsFilePathObjectFilePath
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
      # check if the required `file_id` is null
      if (is.null(self$`file_id`)) {
        return(FALSE)
      }

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
      # check if the required `file_id` is null
      if (is.null(self$`file_id`)) {
        invalid_fields["file_id"] <- "Non-nullable required field `file_id` cannot be null."
      }

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
# MessageContentTextAnnotationsFilePathObjectFilePath$unlock()
#
## Below is an example to define the print function
# MessageContentTextAnnotationsFilePathObjectFilePath$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageContentTextAnnotationsFilePathObjectFilePath$lock()

