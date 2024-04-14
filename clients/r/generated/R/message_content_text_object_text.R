#' Create a new MessageContentTextObjectText
#'
#' @description
#' MessageContentTextObjectText Class
#'
#' @docType class
#' @title MessageContentTextObjectText
#' @description MessageContentTextObjectText Class
#' @format An \code{R6Class} generator object
#' @field value The data that makes up the text. character
#' @field annotations  list(\link{MessageContentTextObjectTextAnnotationsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageContentTextObjectText <- R6::R6Class(
  "MessageContentTextObjectText",
  public = list(
    `value` = NULL,
    `annotations` = NULL,
    #' Initialize a new MessageContentTextObjectText class.
    #'
    #' @description
    #' Initialize a new MessageContentTextObjectText class.
    #'
    #' @param value The data that makes up the text.
    #' @param annotations annotations
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`value`, `annotations`, ...) {
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
      }
      if (!missing(`annotations`)) {
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
    #' @return MessageContentTextObjectText in JSON format
    #' @export
    toJSON = function() {
      MessageContentTextObjectTextObject <- list()
      if (!is.null(self$`value`)) {
        MessageContentTextObjectTextObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`annotations`)) {
        MessageContentTextObjectTextObject[["annotations"]] <-
          lapply(self$`annotations`, function(x) x$toJSON())
      }
      MessageContentTextObjectTextObject
    },
    #' Deserialize JSON string into an instance of MessageContentTextObjectText
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextObjectText
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextObjectText
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
      }
      if (!is.null(this_object$`annotations`)) {
        self$`annotations` <- ApiClient$new()$deserializeObj(this_object$`annotations`, "array[MessageContentTextObjectTextAnnotationsInner]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageContentTextObjectText in JSON format
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
    #' Deserialize JSON string into an instance of MessageContentTextObjectText
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextObjectText
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextObjectText
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`value` <- this_object$`value`
      self$`annotations` <- ApiClient$new()$deserializeObj(this_object$`annotations`, "array[MessageContentTextObjectTextAnnotationsInner]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to MessageContentTextObjectText
    #'
    #' @description
    #' Validate JSON input with respect to MessageContentTextObjectText and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextObjectText: the required field `value` is missing."))
      }
      # check the required field `annotations`
      if (!is.null(input_json$`annotations`)) {
        stopifnot(is.vector(input_json$`annotations`), length(input_json$`annotations`) != 0)
        tmp <- sapply(input_json$`annotations`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextObjectText: the required field `annotations` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageContentTextObjectText
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        return(FALSE)
      }

      # check if the required `annotations` is null
      if (is.null(self$`annotations`)) {
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
      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
      }

      # check if the required `annotations` is null
      if (is.null(self$`annotations`)) {
        invalid_fields["annotations"] <- "Non-nullable required field `annotations` cannot be null."
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
# MessageContentTextObjectText$unlock()
#
## Below is an example to define the print function
# MessageContentTextObjectText$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageContentTextObjectText$lock()

