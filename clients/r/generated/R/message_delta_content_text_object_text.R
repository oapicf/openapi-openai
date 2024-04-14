#' Create a new MessageDeltaContentTextObjectText
#'
#' @description
#' MessageDeltaContentTextObjectText Class
#'
#' @docType class
#' @title MessageDeltaContentTextObjectText
#' @description MessageDeltaContentTextObjectText Class
#' @format An \code{R6Class} generator object
#' @field value The data that makes up the text. character [optional]
#' @field annotations  list(\link{MessageDeltaContentTextObjectTextAnnotationsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaContentTextObjectText <- R6::R6Class(
  "MessageDeltaContentTextObjectText",
  public = list(
    `value` = NULL,
    `annotations` = NULL,
    #' Initialize a new MessageDeltaContentTextObjectText class.
    #'
    #' @description
    #' Initialize a new MessageDeltaContentTextObjectText class.
    #'
    #' @param value The data that makes up the text.
    #' @param annotations annotations
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`value` = NULL, `annotations` = NULL, ...) {
      if (!is.null(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!is.null(`annotations`)) {
        stopifnot(is.vector(`annotations`), length(`annotations`) != 0)
        sapply(`annotations`, function(x) stopifnot(R6::is.R6(x)))
        self$`annotations` <- `annotations`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaContentTextObjectText in JSON format
    #' @export
    toJSON = function() {
      MessageDeltaContentTextObjectTextObject <- list()
      if (!is.null(self$`value`)) {
        MessageDeltaContentTextObjectTextObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`annotations`)) {
        MessageDeltaContentTextObjectTextObject[["annotations"]] <-
          lapply(self$`annotations`, function(x) x$toJSON())
      }
      MessageDeltaContentTextObjectTextObject
    },
    #' Deserialize JSON string into an instance of MessageDeltaContentTextObjectText
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentTextObjectText
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentTextObjectText
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`annotations`)) {
        self$`annotations` <- ApiClient$new()$deserializeObj(this_object$`annotations`, "array[MessageDeltaContentTextObjectTextAnnotationsInner]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaContentTextObjectText in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`value`)) {
          sprintf(
          '"value":
            "%s"
                    ',
          self$`value`
          )
        },
        if (!is.null(self$`annotations`)) {
          sprintf(
          '"annotations":
          [%s]
',
          paste(sapply(self$`annotations`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MessageDeltaContentTextObjectText
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentTextObjectText
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentTextObjectText
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`value` <- this_object$`value`
      self$`annotations` <- ApiClient$new()$deserializeObj(this_object$`annotations`, "array[MessageDeltaContentTextObjectTextAnnotationsInner]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to MessageDeltaContentTextObjectText
    #'
    #' @description
    #' Validate JSON input with respect to MessageDeltaContentTextObjectText and throw an exception if invalid
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
    #' @return String representation of MessageDeltaContentTextObjectText
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
# MessageDeltaContentTextObjectText$unlock()
#
## Below is an example to define the print function
# MessageDeltaContentTextObjectText$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaContentTextObjectText$lock()

