#' Create a new ChatCompletionMessageToolCall
#'
#' @description
#' ChatCompletionMessageToolCall Class
#'
#' @docType class
#' @title ChatCompletionMessageToolCall
#' @description ChatCompletionMessageToolCall Class
#' @format An \code{R6Class} generator object
#' @field id The ID of the tool call. character
#' @field type The type of the tool. Currently, only `function` is supported. character
#' @field function  \link{ChatCompletionMessageToolCallFunction}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionMessageToolCall <- R6::R6Class(
  "ChatCompletionMessageToolCall",
  public = list(
    `id` = NULL,
    `type` = NULL,
    `function` = NULL,

    #' @description
    #' Initialize a new ChatCompletionMessageToolCall class.
    #'
    #' @param id The ID of the tool call.
    #' @param type The type of the tool. Currently, only `function` is supported.
    #' @param function function
    #' @param ... Other optional arguments.
    initialize = function(`id`, `type`, `function`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
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
    #' @return ChatCompletionMessageToolCall in JSON format
    toJSON = function() {
      ChatCompletionMessageToolCallObject <- list()
      if (!is.null(self$`id`)) {
        ChatCompletionMessageToolCallObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        ChatCompletionMessageToolCallObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`function`)) {
        ChatCompletionMessageToolCallObject[["function"]] <-
          self$`function`$toJSON()
      }
      ChatCompletionMessageToolCallObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionMessageToolCall
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionMessageToolCall
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`function`)) {
        `Function__object` <- ChatCompletionMessageToolCallFunction$new()
        `Function__object`$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
        self$`function` <- `Function__object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionMessageToolCall in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
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
    #' Deserialize JSON string into an instance of ChatCompletionMessageToolCall
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionMessageToolCall
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`function` <- ChatCompletionMessageToolCallFunction$new()$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionMessageToolCall and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionMessageToolCall: the required field `id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionMessageToolCall: the required field `type` is missing."))
      }
      # check the required field `function`
      if (!is.null(input_json$`function`)) {
        stopifnot(R6::is.R6(input_json$`function`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionMessageToolCall: the required field `function` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionMessageToolCall
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

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
# ChatCompletionMessageToolCall$unlock()
#
## Below is an example to define the print function
# ChatCompletionMessageToolCall$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionMessageToolCall$lock()

