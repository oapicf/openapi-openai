#' Create a new ChatCompletionNamedToolChoice
#'
#' @description
#' Specifies a tool the model should use. Use to force the model to call a specific function.
#'
#' @docType class
#' @title ChatCompletionNamedToolChoice
#' @description ChatCompletionNamedToolChoice Class
#' @format An \code{R6Class} generator object
#' @field type The type of the tool. Currently, only `function` is supported. character
#' @field function  \link{ChatCompletionNamedToolChoiceFunction}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionNamedToolChoice <- R6::R6Class(
  "ChatCompletionNamedToolChoice",
  public = list(
    `type` = NULL,
    `function` = NULL,

    #' @description
    #' Initialize a new ChatCompletionNamedToolChoice class.
    #'
    #' @param type The type of the tool. Currently, only `function` is supported.
    #' @param function function
    #' @param ... Other optional arguments.
    initialize = function(`type`, `function`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("function"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`function`)) {
        stopifnot(R6::is.R6(`function`))
        self$`function` <- `function`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionNamedToolChoice in JSON format
    toJSON = function() {
      ChatCompletionNamedToolChoiceObject <- list()
      if (!is.null(self$`type`)) {
        ChatCompletionNamedToolChoiceObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`function`)) {
        ChatCompletionNamedToolChoiceObject[["function"]] <-
          self$`function`$toJSON()
      }
      ChatCompletionNamedToolChoiceObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionNamedToolChoice
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionNamedToolChoice
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`function`)) {
        `Function__object` <- ChatCompletionNamedToolChoiceFunction$new()
        `Function__object`$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
        self$`function` <- `Function__object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionNamedToolChoice in JSON format
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
        if (!is.null(self$`function`)) {
          sprintf(
          '"function":
          %s
          ',
          jsonlite::toJSON(self$`function`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionNamedToolChoice
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionNamedToolChoice
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`function` <- ChatCompletionNamedToolChoiceFunction$new()$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionNamedToolChoice and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionNamedToolChoice: the required field `type` is missing."))
      }
      # check the required field `function`
      if (!is.null(input_json$`function`)) {
        stopifnot(R6::is.R6(input_json$`function`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionNamedToolChoice: the required field `function` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionNamedToolChoice
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

      # check if the required `function` is null
      if (is.null(self$`function`)) {
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

      # check if the required `function` is null
      if (is.null(self$`function`)) {
        invalid_fields["function"] <- "Non-nullable required field `function` cannot be null."
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
# ChatCompletionNamedToolChoice$unlock()
#
## Below is an example to define the print function
# ChatCompletionNamedToolChoice$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionNamedToolChoice$lock()

