#' Create a new MessageDeltaContentImageFileObjectImageFile
#'
#' @description
#' MessageDeltaContentImageFileObjectImageFile Class
#'
#' @docType class
#' @title MessageDeltaContentImageFileObjectImageFile
#' @description MessageDeltaContentImageFileObjectImageFile Class
#' @format An \code{R6Class} generator object
#' @field file_id The [File](/docs/api-reference/files) ID of the image in the message content. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaContentImageFileObjectImageFile <- R6::R6Class(
  "MessageDeltaContentImageFileObjectImageFile",
  public = list(
    `file_id` = NULL,
    #' Initialize a new MessageDeltaContentImageFileObjectImageFile class.
    #'
    #' @description
    #' Initialize a new MessageDeltaContentImageFileObjectImageFile class.
    #'
    #' @param file_id The [File](/docs/api-reference/files) ID of the image in the message content.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`file_id` = NULL, ...) {
      if (!is.null(`file_id`)) {
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
    #' @return MessageDeltaContentImageFileObjectImageFile in JSON format
    #' @export
    toJSON = function() {
      MessageDeltaContentImageFileObjectImageFileObject <- list()
      if (!is.null(self$`file_id`)) {
        MessageDeltaContentImageFileObjectImageFileObject[["file_id"]] <-
          self$`file_id`
      }
      MessageDeltaContentImageFileObjectImageFileObject
    },
    #' Deserialize JSON string into an instance of MessageDeltaContentImageFileObjectImageFile
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentImageFileObjectImageFile
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentImageFileObjectImageFile
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
    #' @return MessageDeltaContentImageFileObjectImageFile in JSON format
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
    #' Deserialize JSON string into an instance of MessageDeltaContentImageFileObjectImageFile
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentImageFileObjectImageFile
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentImageFileObjectImageFile
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self
    },
    #' Validate JSON input with respect to MessageDeltaContentImageFileObjectImageFile
    #'
    #' @description
    #' Validate JSON input with respect to MessageDeltaContentImageFileObjectImageFile and throw an exception if invalid
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
    #' @return String representation of MessageDeltaContentImageFileObjectImageFile
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
# MessageDeltaContentImageFileObjectImageFile$unlock()
#
## Below is an example to define the print function
# MessageDeltaContentImageFileObjectImageFile$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaContentImageFileObjectImageFile$lock()

