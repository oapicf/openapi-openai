#' Create a new ChatCompletionRequestMessageContentPartImage
#'
#' @description
#' ChatCompletionRequestMessageContentPartImage Class
#'
#' @docType class
#' @title ChatCompletionRequestMessageContentPartImage
#' @description ChatCompletionRequestMessageContentPartImage Class
#' @format An \code{R6Class} generator object
#' @field type The type of the content part. character
#' @field image_url  \link{ChatCompletionRequestMessageContentPartImageImageUrl}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRequestMessageContentPartImage <- R6::R6Class(
  "ChatCompletionRequestMessageContentPartImage",
  public = list(
    `type` = NULL,
    `image_url` = NULL,
    #' Initialize a new ChatCompletionRequestMessageContentPartImage class.
    #'
    #' @description
    #' Initialize a new ChatCompletionRequestMessageContentPartImage class.
    #'
    #' @param type The type of the content part.
    #' @param image_url image_url
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `image_url`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("image_url"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"image_url\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`image_url`)) {
        stopifnot(R6::is.R6(`image_url`))
        self$`image_url` <- `image_url`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRequestMessageContentPartImage in JSON format
    #' @export
    toJSON = function() {
      ChatCompletionRequestMessageContentPartImageObject <- list()
      if (!is.null(self$`type`)) {
        ChatCompletionRequestMessageContentPartImageObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`image_url`)) {
        ChatCompletionRequestMessageContentPartImageObject[["image_url"]] <-
          self$`image_url`$toJSON()
      }
      ChatCompletionRequestMessageContentPartImageObject
    },
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartImage
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessageContentPartImage
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("image_url"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"image_url\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`image_url`)) {
        `image_url_object` <- ChatCompletionRequestMessageContentPartImageImageUrl$new()
        `image_url_object`$fromJSON(jsonlite::toJSON(this_object$`image_url`, auto_unbox = TRUE, digits = NA))
        self$`image_url` <- `image_url_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRequestMessageContentPartImage in JSON format
    #' @export
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
        if (!is.null(self$`image_url`)) {
          sprintf(
          '"image_url":
          %s
          ',
          jsonlite::toJSON(self$`image_url`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartImage
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRequestMessageContentPartImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRequestMessageContentPartImage
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("image_url"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"image_url\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`image_url` <- ChatCompletionRequestMessageContentPartImageImageUrl$new()$fromJSON(jsonlite::toJSON(this_object$`image_url`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ChatCompletionRequestMessageContentPartImage
    #'
    #' @description
    #' Validate JSON input with respect to ChatCompletionRequestMessageContentPartImage and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestMessageContentPartImage: the required field `type` is missing."))
      }
      # check the required field `image_url`
      if (!is.null(input_json$`image_url`)) {
        stopifnot(R6::is.R6(input_json$`image_url`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionRequestMessageContentPartImage: the required field `image_url` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionRequestMessageContentPartImage
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `image_url` is null
      if (is.null(self$`image_url`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `image_url` is null
      if (is.null(self$`image_url`)) {
        invalid_fields["image_url"] <- "Non-nullable required field `image_url` cannot be null."
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
# ChatCompletionRequestMessageContentPartImage$unlock()
#
## Below is an example to define the print function
# ChatCompletionRequestMessageContentPartImage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionRequestMessageContentPartImage$lock()

