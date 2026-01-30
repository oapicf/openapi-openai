#' Create a new RealtimeServerEventResponseOutputItemDone
#'
#' @description
#' Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
#'
#' @docType class
#' @title RealtimeServerEventResponseOutputItemDone
#' @description RealtimeServerEventResponseOutputItemDone Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `response.output_item.done`. character
#' @field response_id The ID of the Response to which the item belongs. character
#' @field output_index The index of the output item in the Response. integer
#' @field item  \link{RealtimeConversationItem}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventResponseOutputItemDone <- R6::R6Class(
  "RealtimeServerEventResponseOutputItemDone",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `response_id` = NULL,
    `output_index` = NULL,
    `item` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventResponseOutputItemDone class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `response.output_item.done`.
    #' @param response_id The ID of the Response to which the item belongs.
    #' @param output_index The index of the output item in the Response.
    #' @param item item
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `response_id`, `output_index`, `item`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("response.output_item.done"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"response.output_item.done\".", sep = ""))
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
      if (!missing(`output_index`)) {
        if (!(is.numeric(`output_index`) && length(`output_index`) == 1)) {
          stop(paste("Error! Invalid data for `output_index`. Must be an integer:", `output_index`))
        }
        self$`output_index` <- `output_index`
      }
      if (!missing(`item`)) {
        stopifnot(R6::is.R6(`item`))
        self$`item` <- `item`
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
    #' @return RealtimeServerEventResponseOutputItemDone as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventResponseOutputItemDone (x) to a data frame
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
    #' Convert RealtimeServerEventResponseOutputItemDone to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventResponseOutputItemDoneObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventResponseOutputItemDoneObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventResponseOutputItemDoneObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`response_id`)) {
        RealtimeServerEventResponseOutputItemDoneObject[["response_id"]] <-
          self$`response_id`
      }
      if (!is.null(self$`output_index`)) {
        RealtimeServerEventResponseOutputItemDoneObject[["output_index"]] <-
          self$`output_index`
      }
      if (!is.null(self$`item`)) {
        RealtimeServerEventResponseOutputItemDoneObject[["item"]] <-
          self$`item`$toSimpleType()
      }
      return(RealtimeServerEventResponseOutputItemDoneObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventResponseOutputItemDone
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventResponseOutputItemDone
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.output_item.done"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.output_item.done\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`response_id`)) {
        self$`response_id` <- this_object$`response_id`
      }
      if (!is.null(this_object$`output_index`)) {
        self$`output_index` <- this_object$`output_index`
      }
      if (!is.null(this_object$`item`)) {
        `item_object` <- RealtimeConversationItem$new()
        `item_object`$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
        self$`item` <- `item_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventResponseOutputItemDone in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventResponseOutputItemDone
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventResponseOutputItemDone
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("response.output_item.done"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"response.output_item.done\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`response_id` <- this_object$`response_id`
      self$`output_index` <- this_object$`output_index`
      self$`item` <- RealtimeConversationItem$new()$fromJSON(jsonlite::toJSON(this_object$`item`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventResponseOutputItemDone and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseOutputItemDone: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseOutputItemDone: the required field `type` is missing."))
      }
      # check the required field `response_id`
      if (!is.null(input_json$`response_id`)) {
        if (!(is.character(input_json$`response_id`) && length(input_json$`response_id`) == 1)) {
          stop(paste("Error! Invalid data for `response_id`. Must be a string:", input_json$`response_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseOutputItemDone: the required field `response_id` is missing."))
      }
      # check the required field `output_index`
      if (!is.null(input_json$`output_index`)) {
        if (!(is.numeric(input_json$`output_index`) && length(input_json$`output_index`) == 1)) {
          stop(paste("Error! Invalid data for `output_index`. Must be an integer:", input_json$`output_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseOutputItemDone: the required field `output_index` is missing."))
      }
      # check the required field `item`
      if (!is.null(input_json$`item`)) {
        stopifnot(R6::is.R6(input_json$`item`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventResponseOutputItemDone: the required field `item` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventResponseOutputItemDone
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

      # check if the required `output_index` is null
      if (is.null(self$`output_index`)) {
        return(FALSE)
      }

      # check if the required `item` is null
      if (is.null(self$`item`)) {
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

      # check if the required `output_index` is null
      if (is.null(self$`output_index`)) {
        invalid_fields["output_index"] <- "Non-nullable required field `output_index` cannot be null."
      }

      # check if the required `item` is null
      if (is.null(self$`item`)) {
        invalid_fields["item"] <- "Non-nullable required field `item` cannot be null."
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
# RealtimeServerEventResponseOutputItemDone$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventResponseOutputItemDone$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventResponseOutputItemDone$lock()

