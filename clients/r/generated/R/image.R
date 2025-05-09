#' Create a new Image
#'
#' @description
#' Represents the url or the content of an image generated by the OpenAI API.
#'
#' @docType class
#' @title Image
#' @description Image Class
#' @format An \code{R6Class} generator object
#' @field b64_json The base64-encoded JSON of the generated image, if `response_format` is `b64_json`. character [optional]
#' @field url The URL of the generated image, if `response_format` is `url` (default). character [optional]
#' @field revised_prompt The prompt that was used to generate the image, if there was any revision to the prompt. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Image <- R6::R6Class(
  "Image",
  public = list(
    `b64_json` = NULL,
    `url` = NULL,
    `revised_prompt` = NULL,

    #' @description
    #' Initialize a new Image class.
    #'
    #' @param b64_json The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
    #' @param url The URL of the generated image, if `response_format` is `url` (default).
    #' @param revised_prompt The prompt that was used to generate the image, if there was any revision to the prompt.
    #' @param ... Other optional arguments.
    initialize = function(`b64_json` = NULL, `url` = NULL, `revised_prompt` = NULL, ...) {
      if (!is.null(`b64_json`)) {
        if (!(is.character(`b64_json`) && length(`b64_json`) == 1)) {
          stop(paste("Error! Invalid data for `b64_json`. Must be a string:", `b64_json`))
        }
        self$`b64_json` <- `b64_json`
      }
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`revised_prompt`)) {
        if (!(is.character(`revised_prompt`) && length(`revised_prompt`) == 1)) {
          stop(paste("Error! Invalid data for `revised_prompt`. Must be a string:", `revised_prompt`))
        }
        self$`revised_prompt` <- `revised_prompt`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return Image in JSON format
    toJSON = function() {
      ImageObject <- list()
      if (!is.null(self$`b64_json`)) {
        ImageObject[["b64_json"]] <-
          self$`b64_json`
      }
      if (!is.null(self$`url`)) {
        ImageObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`revised_prompt`)) {
        ImageObject[["revised_prompt"]] <-
          self$`revised_prompt`
      }
      ImageObject
    },

    #' @description
    #' Deserialize JSON string into an instance of Image
    #'
    #' @param input_json the JSON input
    #' @return the instance of Image
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`b64_json`)) {
        self$`b64_json` <- this_object$`b64_json`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`revised_prompt`)) {
        self$`revised_prompt` <- this_object$`revised_prompt`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return Image in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`b64_json`)) {
          sprintf(
          '"b64_json":
            "%s"
                    ',
          self$`b64_json`
          )
        },
        if (!is.null(self$`url`)) {
          sprintf(
          '"url":
            "%s"
                    ',
          self$`url`
          )
        },
        if (!is.null(self$`revised_prompt`)) {
          sprintf(
          '"revised_prompt":
            "%s"
                    ',
          self$`revised_prompt`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of Image
    #'
    #' @param input_json the JSON input
    #' @return the instance of Image
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`b64_json` <- this_object$`b64_json`
      self$`url` <- this_object$`url`
      self$`revised_prompt` <- this_object$`revised_prompt`
      self
    },

    #' @description
    #' Validate JSON input with respect to Image and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Image
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
# Image$unlock()
#
## Below is an example to define the print function
# Image$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Image$lock()

