#' Create a new ChatCompletionMessageToolCallChunk
#'
#' @description
#' ChatCompletionMessageToolCallChunk Class
#'
#' @docType class
#' @title ChatCompletionMessageToolCallChunk
#' @description ChatCompletionMessageToolCallChunk Class
#' @format An \code{R6Class} generator object
#' @field index  integer
#' @field id The ID of the tool call. character [optional]
#' @field type The type of the tool. Currently, only `function` is supported. character [optional]
#' @field function  \link{ChatCompletionMessageToolCallChunkFunction} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionMessageToolCallChunk <- R6::R6Class(
  "ChatCompletionMessageToolCallChunk",
  public = list(
    `index` = NULL,
    `id` = NULL,
    `type` = NULL,
    `function` = NULL,
    #' Initialize a new ChatCompletionMessageToolCallChunk class.
    #'
    #' @description
    #' Initialize a new ChatCompletionMessageToolCallChunk class.
    #'
    #' @param index index
    #' @param id The ID of the tool call.
    #' @param type The type of the tool. Currently, only `function` is supported.
    #' @param function function
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`index`, `id` = NULL, `type` = NULL, `function` = NULL, ...) {
      if (!missing(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c("function"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`function`)) {
        stopifnot(R6::is.R6(`function`))
        self$`function` <- `function`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionMessageToolCallChunk in JSON format
    #' @export
    toJSON = function() {
      ChatCompletionMessageToolCallChunkObject <- list()
      if (!is.null(self$`index`)) {
        ChatCompletionMessageToolCallChunkObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`id`)) {
        ChatCompletionMessageToolCallChunkObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        ChatCompletionMessageToolCallChunkObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`function`)) {
        ChatCompletionMessageToolCallChunkObject[["function"]] <-
          self$`function`$toJSON()
      }
      ChatCompletionMessageToolCallChunkObject
    },
    #' Deserialize JSON string into an instance of ChatCompletionMessageToolCallChunk
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionMessageToolCallChunk
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionMessageToolCallChunk
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
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
        `Function__object` <- ChatCompletionMessageToolCallChunkFunction$new()
        `Function__object`$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
        self$`function` <- `Function__object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionMessageToolCallChunk in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`index`)) {
          sprintf(
          '"index":
            %d
                    ',
          self$`index`
          )
        },
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
    #' Deserialize JSON string into an instance of ChatCompletionMessageToolCallChunk
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionMessageToolCallChunk
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionMessageToolCallChunk
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`index` <- this_object$`index`
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`function` <- ChatCompletionMessageToolCallChunkFunction$new()$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ChatCompletionMessageToolCallChunk
    #'
    #' @description
    #' Validate JSON input with respect to ChatCompletionMessageToolCallChunk and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
        if (!(is.numeric(input_json$`index`) && length(input_json$`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", input_json$`index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionMessageToolCallChunk: the required field `index` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionMessageToolCallChunk
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
      # check if the required `index` is null
      if (is.null(self$`index`)) {
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
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
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
# ChatCompletionMessageToolCallChunk$unlock()
#
## Below is an example to define the print function
# ChatCompletionMessageToolCallChunk$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionMessageToolCallChunk$lock()

