#' Create a new ImagesResponseDataInner
#'
#' @description
#' ImagesResponseDataInner Class
#'
#' @docType class
#' @title ImagesResponseDataInner
#' @description ImagesResponseDataInner Class
#' @format An \code{R6Class} generator object
#' @field url  character [optional]
#' @field b64_json  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ImagesResponseDataInner <- R6::R6Class(
  "ImagesResponseDataInner",
  public = list(
    `url` = NULL,
    `b64_json` = NULL,
    #' Initialize a new ImagesResponseDataInner class.
    #'
    #' @description
    #' Initialize a new ImagesResponseDataInner class.
    #'
    #' @param url url
    #' @param b64_json b64_json
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`url` = NULL, `b64_json` = NULL, ...) {
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`b64_json`)) {
        if (!(is.character(`b64_json`) && length(`b64_json`) == 1)) {
          stop(paste("Error! Invalid data for `b64_json`. Must be a string:", `b64_json`))
        }
        self$`b64_json` <- `b64_json`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ImagesResponseDataInner in JSON format
    #' @export
    toJSON = function() {
      ImagesResponseDataInnerObject <- list()
      if (!is.null(self$`url`)) {
        ImagesResponseDataInnerObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`b64_json`)) {
        ImagesResponseDataInnerObject[["b64_json"]] <-
          self$`b64_json`
      }
      ImagesResponseDataInnerObject
    },
    #' Deserialize JSON string into an instance of ImagesResponseDataInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of ImagesResponseDataInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImagesResponseDataInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`b64_json`)) {
        self$`b64_json` <- this_object$`b64_json`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ImagesResponseDataInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`b64_json`)) {
          sprintf(
          '"b64_json":
            "%s"
                    ',
          self$`b64_json`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ImagesResponseDataInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of ImagesResponseDataInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ImagesResponseDataInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`url` <- this_object$`url`
      self$`b64_json` <- this_object$`b64_json`
      self
    },
    #' Validate JSON input with respect to ImagesResponseDataInner
    #'
    #' @description
    #' Validate JSON input with respect to ImagesResponseDataInner and throw an exception if invalid
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
    #' @return String representation of ImagesResponseDataInner
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
# ImagesResponseDataInner$unlock()
#
## Below is an example to define the print function
# ImagesResponseDataInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ImagesResponseDataInner$lock()

