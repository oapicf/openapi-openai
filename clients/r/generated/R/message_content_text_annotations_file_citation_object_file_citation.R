#' Create a new MessageContentTextAnnotationsFileCitationObjectFileCitation
#'
#' @description
#' MessageContentTextAnnotationsFileCitationObjectFileCitation Class
#'
#' @docType class
#' @title MessageContentTextAnnotationsFileCitationObjectFileCitation
#' @description MessageContentTextAnnotationsFileCitationObjectFileCitation Class
#' @format An \code{R6Class} generator object
#' @field file_id The ID of the specific File the citation is from. character
#' @field quote The specific quote in the file. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageContentTextAnnotationsFileCitationObjectFileCitation <- R6::R6Class(
  "MessageContentTextAnnotationsFileCitationObjectFileCitation",
  public = list(
    `file_id` = NULL,
    `quote` = NULL,
    #' Initialize a new MessageContentTextAnnotationsFileCitationObjectFileCitation class.
    #'
    #' @description
    #' Initialize a new MessageContentTextAnnotationsFileCitationObjectFileCitation class.
    #'
    #' @param file_id The ID of the specific File the citation is from.
    #' @param quote The specific quote in the file.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`file_id`, `quote`, ...) {
      if (!missing(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
      }
      if (!missing(`quote`)) {
        if (!(is.character(`quote`) && length(`quote`) == 1)) {
          stop(paste("Error! Invalid data for `quote`. Must be a string:", `quote`))
        }
        self$`quote` <- `quote`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageContentTextAnnotationsFileCitationObjectFileCitation in JSON format
    #' @export
    toJSON = function() {
      MessageContentTextAnnotationsFileCitationObjectFileCitationObject <- list()
      if (!is.null(self$`file_id`)) {
        MessageContentTextAnnotationsFileCitationObjectFileCitationObject[["file_id"]] <-
          self$`file_id`
      }
      if (!is.null(self$`quote`)) {
        MessageContentTextAnnotationsFileCitationObjectFileCitationObject[["quote"]] <-
          self$`quote`
      }
      MessageContentTextAnnotationsFileCitationObjectFileCitationObject
    },
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageContentTextAnnotationsFileCitationObjectFileCitation in JSON format
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
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self$`quote` <- this_object$`quote`
      self
    },
    #' Validate JSON input with respect to MessageContentTextAnnotationsFileCitationObjectFileCitation
    #'
    #' @description
    #' Validate JSON input with respect to MessageContentTextAnnotationsFileCitationObjectFileCitation and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextAnnotationsFileCitationObjectFileCitation: the required field `file_id` is missing."))
      }
      # check the required field `quote`
      if (!is.null(input_json$`quote`)) {
        if (!(is.character(input_json$`quote`) && length(input_json$`quote`) == 1)) {
          stop(paste("Error! Invalid data for `quote`. Must be a string:", input_json$`quote`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextAnnotationsFileCitationObjectFileCitation: the required field `quote` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageContentTextAnnotationsFileCitationObjectFileCitation
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

      # check if the required `quote` is null
      if (is.null(self$`quote`)) {
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

      # check if the required `quote` is null
      if (is.null(self$`quote`)) {
        invalid_fields["quote"] <- "Non-nullable required field `quote` cannot be null."
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
# MessageContentTextAnnotationsFileCitationObjectFileCitation$unlock()
#
## Below is an example to define the print function
# MessageContentTextAnnotationsFileCitationObjectFileCitation$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageContentTextAnnotationsFileCitationObjectFileCitation$lock()

