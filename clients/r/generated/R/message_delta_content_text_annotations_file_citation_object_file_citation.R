#' Create a new MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
#'
#' @description
#' MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation Class
#'
#' @docType class
#' @title MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
#' @description MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation Class
#' @format An \code{R6Class} generator object
#' @field file_id The ID of the specific File the citation is from. character [optional]
#' @field quote The specific quote in the file. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation <- R6::R6Class(
  "MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation",
  public = list(
    `file_id` = NULL,
    `quote` = NULL,

    #' @description
    #' Initialize a new MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation class.
    #'
    #' @param file_id The ID of the specific File the citation is from.
    #' @param quote The specific quote in the file.
    #' @param ... Other optional arguments.
    initialize = function(`file_id` = NULL, `quote` = NULL, ...) {
      if (!is.null(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
      }
      if (!is.null(`quote`)) {
        if (!(is.character(`quote`) && length(`quote`) == 1)) {
          stop(paste("Error! Invalid data for `quote`. Must be a string:", `quote`))
        }
        self$`quote` <- `quote`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation in JSON format
    toJSON = function() {
      MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationObject <- list()
      if (!is.null(self$`file_id`)) {
        MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationObject[["file_id"]] <-
          self$`file_id`
      }
      if (!is.null(self$`quote`)) {
        MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationObject[["quote"]] <-
          self$`quote`
      }
      MessageDeltaContentTextAnnotationsFileCitationObjectFileCitationObject
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_id`)) {
        self$`file_id` <- this_object$`file_id`
      }
      if (!is.null(this_object$`quote`)) {
        self$`quote` <- this_object$`quote`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`file_id`)) {
          sprintf(
          '"file_id":
            "%s"
                    ',
          self$`file_id`
          )
        },
        if (!is.null(self$`quote`)) {
          sprintf(
          '"quote":
            "%s"
                    ',
          self$`quote`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self$`quote` <- this_object$`quote`
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation$unlock()
#
## Below is an example to define the print function
# MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation$lock()

