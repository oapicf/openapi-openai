#' Create a new RealtimeServerEventResponseTextDone
#'
#' @description
#' Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
#'
#' @docType class
#' @title RealtimeServerEventResponseTextDone
#' @description RealtimeServerEventResponseTextDone Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `response.text.done`. character
#' @field response_id The ID of the response. character
#' @field item_id The ID of the item. character
#' @field output_index The index of the output item in the response. integer
#' @field content_index The index of the content part in the item's content array. integer
#' @field text The final text content. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventResponseTextDone <- R6::R6Class(
  "RealtimeServerEventResponseTextDone",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `response_id` = NULL,
    `item_id` = NULL,
    `output_index` = NULL,
    `content_index` = NULL,
    `text` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventResponseTextDone class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `response.text.done`.
    #' @param response_id The ID of the response.
    #' @param item_id The ID of the item.
    #' @param output_index The index of the output item in the response.
    #' @param content_index The index of the content part in the item's content array.
    #' @param text The final text content.
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `response_id`, `item_id`, `output_index`, `content_index`, `text`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("response.text.done"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"response.text.done\".", sep = ""))
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
      if (!missing(`content_index`)) {
        if (!(is.numeric(`content_index`) && length(`content_index`) == 1)) {
          stop(paste("Error! Invalid data for `content_index`. Must be an integer:", `content_index`))
        }
        self$`content_index` <- `content_index`
      }
      if (!missing(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
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
    #' @return RealtimeServerEventResponseTextDone as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventResponseTextDone (x) to a data frame
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
    #' Convert RealtimeServerEventResponseTextDone to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventResponseTextDoneObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventResponseTextDoneObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventResponseTextDoneObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`response_id`)) {
        RealtimeServerEventResponseTextDoneObject[["response_id"]] <-
          self$`response_id`
      }
      if (!is.null(self$`item_id`)) {
        RealtimeServerEventResponseTextDoneObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`output_index`)) {
        RealtimeServerEventResponseTextDoneObject[["output_index"]] <-
          self$`output_index`
      }
      if (!is.null(self$`content_index`)) {
        RealtimeServerEventResponseTextDoneObject[["content_index"]] <-
          self$`content_index`
      }
      if (!is.null(self$`text`)) {
        RealtimeServerEventResponseTextDoneObject[["text"]] <-
          self$`text`
      }
      return(RealtimeServerEventResponseTextDoneObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventResponseTextDone
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventResponseTextDone
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.text.done"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.text.done\".", sep = ""))
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
      if (!is.null(this_object$`content_index`)) {
        self$`content_index` <- this_object$`content_index`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventResponseTextDone in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventResponseTextDone
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventResponseTextDone
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.text.done"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.text.done\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`response_id` <- this_object$`response_id`
      self$`item_id` <- this_object$`item_id`
      self$`output_index` <- this_object$`output_index`
      self$`content_index` <- this_object$`content_index`
      self$`text` <- this_object$`text`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventResponseTextDone and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseTextDone: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseTextDone: the required field `type` is missing."))
      }
      # check the required field `response_id`
      if (!is.null(input_json$`response_id`)) {
        if (!(is.character(input_json$`response_id`) && length(input_json$`response_id`) == 1)) {
          stop(paste("Error! Invalid data for `response_id`. Must be a string:", input_json$`response_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseTextDone: the required field `response_id` is missing."))
      }
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseTextDone: the required field `item_id` is missing."))
      }
      # check the required field `output_index`
      if (!is.null(input_json$`output_index`)) {
        if (!(is.numeric(input_json$`output_index`) && length(input_json$`output_index`) == 1)) {
          stop(paste("Error! Invalid data for `output_index`. Must be an integer:", input_json$`output_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseTextDone: the required field `output_index` is missing."))
      }
      # check the required field `content_index`
      if (!is.null(input_json$`content_index`)) {
        if (!(is.numeric(input_json$`content_index`) && length(input_json$`content_index`) == 1)) {
          stop(paste("Error! Invalid data for `content_index`. Must be an integer:", input_json$`content_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseTextDone: the required field `content_index` is missing."))
      }
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseTextDone: the required field `text` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventResponseTextDone
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

      # check if the required `content_index` is null
      if (is.null(self$`content_index`)) {
        return(FALSE)
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
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

      # check if the required `content_index` is null
      if (is.null(self$`content_index`)) {
        invalid_fields["content_index"] <- "Non-nullable required field `content_index` cannot be null."
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        invalid_fields["text"] <- "Non-nullable required field `text` cannot be null."
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
# RealtimeServerEventResponseTextDone$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventResponseTextDone$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventResponseTextDone$lock()

