#' Create a new RunStepDeltaStepDetailsToolCallsRetrievalObject
#'
#' @description
#' RunStepDeltaStepDetailsToolCallsRetrievalObject Class
#'
#' @docType class
#' @title RunStepDeltaStepDetailsToolCallsRetrievalObject
#' @description RunStepDeltaStepDetailsToolCallsRetrievalObject Class
#' @format An \code{R6Class} generator object
#' @field index The index of the tool call in the tool calls array. integer
#' @field id The ID of the tool call object. character [optional]
#' @field type The type of tool call. This is always going to be `retrieval` for this type of tool call. character
#' @field retrieval For now, this is always going to be an empty object. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaStepDetailsToolCallsRetrievalObject <- R6::R6Class(
  "RunStepDeltaStepDetailsToolCallsRetrievalObject",
  public = list(
    `index` = NULL,
    `id` = NULL,
    `type` = NULL,
    `retrieval` = NULL,

    #' @description
    #' Initialize a new RunStepDeltaStepDetailsToolCallsRetrievalObject class.
    #'
    #' @param index The index of the tool call in the tool calls array.
    #' @param type The type of tool call. This is always going to be `retrieval` for this type of tool call.
    #' @param id The ID of the tool call object.
    #' @param retrieval For now, this is always going to be an empty object.
    #' @param ... Other optional arguments.
    initialize = function(`index`, `type`, `id` = NULL, `retrieval` = NULL, ...) {
      if (!missing(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("retrieval"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"retrieval\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`retrieval`)) {
        self$`retrieval` <- `retrieval`
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
    #' @return RunStepDeltaStepDetailsToolCallsRetrievalObject as a base R list.
    #' @examples
    #' # convert array of RunStepDeltaStepDetailsToolCallsRetrievalObject (x) to a data frame
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
    #' Convert RunStepDeltaStepDetailsToolCallsRetrievalObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDeltaStepDetailsToolCallsRetrievalObjectObject <- list()
      if (!is.null(self$`index`)) {
        RunStepDeltaStepDetailsToolCallsRetrievalObjectObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`id`)) {
        RunStepDeltaStepDetailsToolCallsRetrievalObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        RunStepDeltaStepDetailsToolCallsRetrievalObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`retrieval`)) {
        RunStepDeltaStepDetailsToolCallsRetrievalObjectObject[["retrieval"]] <-
          self$`retrieval`
      }
      return(RunStepDeltaStepDetailsToolCallsRetrievalObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsRetrievalObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsRetrievalObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("retrieval"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"retrieval\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`retrieval`)) {
        self$`retrieval` <- this_object$`retrieval`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDeltaStepDetailsToolCallsRetrievalObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsRetrievalObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsRetrievalObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`index` <- this_object$`index`
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("retrieval"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"retrieval\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`retrieval` <- this_object$`retrieval`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDeltaStepDetailsToolCallsRetrievalObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
        if (!(is.numeric(input_json$`index`) && length(input_json$`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", input_json$`index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDeltaStepDetailsToolCallsRetrievalObject: the required field `index` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDeltaStepDetailsToolCallsRetrievalObject: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDeltaStepDetailsToolCallsRetrievalObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# RunStepDeltaStepDetailsToolCallsRetrievalObject$unlock()
#
## Below is an example to define the print function
# RunStepDeltaStepDetailsToolCallsRetrievalObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaStepDetailsToolCallsRetrievalObject$lock()

