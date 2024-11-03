#' Create a new ChatCompletionRequestMessageContentPartImageImageUrl
#'
#' @description
#' ChatCompletionRequestMessageContentPartImageImageUrl Class
#'
#' @docType class
#' @title ChatCompletionRequestMessageContentPartImageImageUrl
#' @description ChatCompletionRequestMessageContentPartImageImageUrl Class
#' @format An \code{R6Class} generator object
#' @field url Either a URL of the image or the base64 encoded image data. character
#' @field detail Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestMessageContentPartImageImageUrl <- R6::R6Class(
  "ChatCompletionRequestMessageContentPartImageImageUrl",
  public = list(
    `url` = NULL,
    `detail` = NULL,

    #' @description
    #' Initialize a new ChatCompletionRequestMessageContentPartImageImageUrl class.
    #'
    #' @param url Either a URL of the image or the base64 encoded image data.
    #' @param detail Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).. Default to "auto".
    #' @param ... Other optional arguments.
    initialize = function(`url`, `detail` = "auto", ...) {
      if (!missing(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `url`. Must be a URL:", `url`))
        }
        self$`url` <- `url`
      }
      if (!is.null(`detail`)) {
        if (!(`detail` %in% c("auto", "low", "high"))) {
          stop(paste("Error! \"", `detail`, "\" cannot be assigned to `detail`. Must be \"auto\", \"low\", \"high\".", sep = ""))
        }
        if (!(is.character(`detail`) && length(`detail`) == 1)) {
          stop(paste("Error! Invalid data for `detail`. Must be a string:", `detail`))
        }
        self$`detail` <- `detail`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRequestMessageContentPartImageImageUrl in JSON format
    toJSON = function() {
      ChatCompletionRequestMessageContentPartImageImageUrlObject <- list()
      if (!is.null(self$`url`)) {
        ChatCompletionRequestMessageContentPartImageImageUrlObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`detail`)) {
        ChatCompletionRequestMessageContentPartImageImageUrlObject[["detail"]] <-
          self$`detail`
      }
      ChatCompletionRequestMessageContentPartImageImageUrlObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartImageImageUrl
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessageContentPartImageImageUrl
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`url`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `url`. Must be a URL:", this_object$`url`))
        }
        self$`url` <- this_object$`url`
      }
      if (!is.null(this_object$`detail`)) {
        if (!is.null(this_object$`detail`) && !(this_object$`detail` %in% c("auto", "low", "high"))) {
          stop(paste("Error! \"", this_object$`detail`, "\" cannot be assigned to `detail`. Must be \"auto\", \"low\", \"high\".", sep = ""))
        }
        self$`detail` <- this_object$`detail`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRequestMessageContentPartImageImageUrl in JSON format
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
        if (!is.null(self$`detail`)) {
          sprintf(
          '"detail":
            "%s"
                    ',
          self$`detail`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartImageImageUrl
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessageContentPartImageImageUrl
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `url`. Must be a URL:", this_object$`url`))
      }
      self$`url` <- this_object$`url`
      if (!is.null(this_object$`detail`) && !(this_object$`detail` %in% c("auto", "low", "high"))) {
        stop(paste("Error! \"", this_object$`detail`, "\" cannot be assigned to `detail`. Must be \"auto\", \"low\", \"high\".", sep = ""))
      }
      self$`detail` <- this_object$`detail`
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestMessageContentPartImageImageUrl and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `url`
      if (!is.null(input_json$`url`)) {
        if (!(is.character(input_json$`url`) && length(input_json$`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", input_json$`url`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(input_json$`url`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `url`. Must be a URL:", input_json$`url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestMessageContentPartImageImageUrl: the required field `url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestMessageContentPartImageImageUrl
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `url` is null
      if (is.null(self$`url`)) {
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
      # check if the required `url` is null
      if (is.null(self$`url`)) {
        invalid_fields["url"] <- "Non-nullable required field `url` cannot be null."
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
# ChatCompletionRequestMessageContentPartImageImageUrl$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestMessageContentPartImageImageUrl$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestMessageContentPartImageImageUrl$lock()

