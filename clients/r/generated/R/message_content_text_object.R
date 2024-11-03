#' Create a new MessageContentTextObject
#'
#' @description
#' The text content that is part of a message.
#'
#' @docType class
#' @title MessageContentTextObject
#' @description MessageContentTextObject Class
#' @format An \code{R6Class} generator object
#' @field type Always `text`. character
#' @field text  \link{MessageContentTextObjectText}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageContentTextObject <- R6::R6Class(
  "MessageContentTextObject",
  public = list(
    `type` = NULL,
    `text` = NULL,

    #' @description
    #' Initialize a new MessageContentTextObject class.
    #'
    #' @param type Always `text`.
    #' @param text text
    #' @param ... Other optional arguments.
    initialize = function(`type`, `text`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("text"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"text\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`text`)) {
        stopifnot(R6::is.R6(`text`))
        self$`text` <- `text`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageContentTextObject in JSON format
    toJSON = function() {
      MessageContentTextObjectObject <- list()
      if (!is.null(self$`type`)) {
        MessageContentTextObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`text`)) {
        MessageContentTextObjectObject[["text"]] <-
          self$`text`$toJSON()
      }
      MessageContentTextObjectObject
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`text`)) {
        `text_object` <- MessageContentTextObjectText$new()
        `text_object`$fromJSON(jsonlite::toJSON(this_object$`text`, auto_unbox = TRUE, digits = NA))
        self$`text` <- `text_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageContentTextObject in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`text`)) {
          sprintf(
          '"text":
          %s
          ',
          jsonlite::toJSON(self$`text`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("text"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"text\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`text` <- MessageContentTextObjectText$new()$fromJSON(jsonlite::toJSON(this_object$`text`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageContentTextObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextObject: the required field `type` is missing."))
      }
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        stopifnot(R6::is.R6(input_json$`text`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextObject: the required field `text` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageContentTextObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        invalid_fields["text"] <- "Non-nullable required field `text` cannot be null."
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
# MessageContentTextObject$unlock()
#
## Below is an example to define the print function
# MessageContentTextObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageContentTextObject$lock()

