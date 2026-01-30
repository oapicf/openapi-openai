#' Create a new RealtimeServerEventResponseFunctionCallArgumentsDone
#'
#' @description
#' Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
#'
#' @docType class
#' @title RealtimeServerEventResponseFunctionCallArgumentsDone
#' @description RealtimeServerEventResponseFunctionCallArgumentsDone Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `response.function_call_arguments.done`. character
#' @field response_id The ID of the response. character
#' @field item_id The ID of the function call item. character
#' @field output_index The index of the output item in the response. integer
#' @field call_id The ID of the function call. character
#' @field arguments The final arguments as a JSON string. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventResponseFunctionCallArgumentsDone <- R6::R6Class(
  "RealtimeServerEventResponseFunctionCallArgumentsDone",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `response_id` = NULL,
    `item_id` = NULL,
    `output_index` = NULL,
    `call_id` = NULL,
    `arguments` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventResponseFunctionCallArgumentsDone class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `response.function_call_arguments.done`.
    #' @param response_id The ID of the response.
    #' @param item_id The ID of the function call item.
    #' @param output_index The index of the output item in the response.
    #' @param call_id The ID of the function call.
    #' @param arguments The final arguments as a JSON string.
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `response_id`, `item_id`, `output_index`, `call_id`, `arguments`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("response.function_call_arguments.done"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"response.function_call_arguments.done\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`response_id`)) {
        if (!(is.character(`response_id`) && length(`response_id`) == 1)) {
          stop(paste("Error! Invalid data for `response_id`. Must be a string:", `response_id`))
        }
        self$`response_id` <- `response_id`
      }
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`output_index`)) {
        if (!(is.numeric(`output_index`) && length(`output_index`) == 1)) {
          stop(paste("Error! Invalid data for `output_index`. Must be an integer:", `output_index`))
        }
        self$`output_index` <- `output_index`
      }
      if (!missing(`call_id`)) {
        if (!(is.character(`call_id`) && length(`call_id`) == 1)) {
          stop(paste("Error! Invalid data for `call_id`. Must be a string:", `call_id`))
        }
        self$`call_id` <- `call_id`
      }
      if (!missing(`arguments`)) {
        if (!(is.character(`arguments`) && length(`arguments`) == 1)) {
          stop(paste("Error! Invalid data for `arguments`. Must be a string:", `arguments`))
        }
        self$`arguments` <- `arguments`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return RealtimeServerEventResponseFunctionCallArgumentsDone as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventResponseFunctionCallArgumentsDone (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert RealtimeServerEventResponseFunctionCallArgumentsDone to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventResponseFunctionCallArgumentsDoneObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventResponseFunctionCallArgumentsDoneObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventResponseFunctionCallArgumentsDoneObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`response_id`)) {
        RealtimeServerEventResponseFunctionCallArgumentsDoneObject[["response_id"]] <-
          self$`response_id`
      }
      if (!is.null(self$`item_id`)) {
        RealtimeServerEventResponseFunctionCallArgumentsDoneObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`output_index`)) {
        RealtimeServerEventResponseFunctionCallArgumentsDoneObject[["output_index"]] <-
          self$`output_index`
      }
      if (!is.null(self$`call_id`)) {
        RealtimeServerEventResponseFunctionCallArgumentsDoneObject[["call_id"]] <-
          self$`call_id`
      }
      if (!is.null(self$`arguments`)) {
        RealtimeServerEventResponseFunctionCallArgumentsDoneObject[["arguments"]] <-
          self$`arguments`
      }
      return(RealtimeServerEventResponseFunctionCallArgumentsDoneObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventResponseFunctionCallArgumentsDone
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventResponseFunctionCallArgumentsDone
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.function_call_arguments.done"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.function_call_arguments.done\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`response_id`)) {
        self$`response_id` <- this_object$`response_id`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`output_index`)) {
        self$`output_index` <- this_object$`output_index`
      }
      if (!is.null(this_object$`call_id`)) {
        self$`call_id` <- this_object$`call_id`
      }
      if (!is.null(this_object$`arguments`)) {
        self$`arguments` <- this_object$`arguments`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventResponseFunctionCallArgumentsDone in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventResponseFunctionCallArgumentsDone
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventResponseFunctionCallArgumentsDone
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.function_call_arguments.done"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.function_call_arguments.done\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`response_id` <- this_object$`response_id`
      self$`item_id` <- this_object$`item_id`
      self$`output_index` <- this_object$`output_index`
      self$`call_id` <- this_object$`call_id`
      self$`arguments` <- this_object$`arguments`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventResponseFunctionCallArgumentsDone and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `event_id`
      if (!is.null(input_json$`event_id`)) {
        if (!(is.character(input_json$`event_id`) && length(input_json$`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", input_json$`event_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseFunctionCallArgumentsDone: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseFunctionCallArgumentsDone: the required field `type` is missing."))
      }
      # check the required field `response_id`
      if (!is.null(input_json$`response_id`)) {
        if (!(is.character(input_json$`response_id`) && length(input_json$`response_id`) == 1)) {
          stop(paste("Error! Invalid data for `response_id`. Must be a string:", input_json$`response_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseFunctionCallArgumentsDone: the required field `response_id` is missing."))
      }
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseFunctionCallArgumentsDone: the required field `item_id` is missing."))
      }
      # check the required field `output_index`
      if (!is.null(input_json$`output_index`)) {
        if (!(is.numeric(input_json$`output_index`) && length(input_json$`output_index`) == 1)) {
          stop(paste("Error! Invalid data for `output_index`. Must be an integer:", input_json$`output_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseFunctionCallArgumentsDone: the required field `output_index` is missing."))
      }
      # check the required field `call_id`
      if (!is.null(input_json$`call_id`)) {
        if (!(is.character(input_json$`call_id`) && length(input_json$`call_id`) == 1)) {
          stop(paste("Error! Invalid data for `call_id`. Must be a string:", input_json$`call_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseFunctionCallArgumentsDone: the required field `call_id` is missing."))
      }
      # check the required field `arguments`
      if (!is.null(input_json$`arguments`)) {
        if (!(is.character(input_json$`arguments`) && length(input_json$`arguments`) == 1)) {
          stop(paste("Error! Invalid data for `arguments`. Must be a string:", input_json$`arguments`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseFunctionCallArgumentsDone: the required field `arguments` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventResponseFunctionCallArgumentsDone
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `response_id` is null
      if (is.null(self$`response_id`)) {
        return(FALSE)
      }

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        return(FALSE)
      }

      # check if the required `output_index` is null
      if (is.null(self$`output_index`)) {
        return(FALSE)
      }

      # check if the required `call_id` is null
      if (is.null(self$`call_id`)) {
        return(FALSE)
      }

      # check if the required `arguments` is null
      if (is.null(self$`arguments`)) {
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
      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        invalid_fields["event_id"] <- "Non-nullable required field `event_id` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `response_id` is null
      if (is.null(self$`response_id`)) {
        invalid_fields["response_id"] <- "Non-nullable required field `response_id` cannot be null."
      }

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
      }

      # check if the required `output_index` is null
      if (is.null(self$`output_index`)) {
        invalid_fields["output_index"] <- "Non-nullable required field `output_index` cannot be null."
      }

      # check if the required `call_id` is null
      if (is.null(self$`call_id`)) {
        invalid_fields["call_id"] <- "Non-nullable required field `call_id` cannot be null."
      }

      # check if the required `arguments` is null
      if (is.null(self$`arguments`)) {
        invalid_fields["arguments"] <- "Non-nullable required field `arguments` cannot be null."
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
# RealtimeServerEventResponseFunctionCallArgumentsDone$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventResponseFunctionCallArgumentsDone$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventResponseFunctionCallArgumentsDone$lock()

