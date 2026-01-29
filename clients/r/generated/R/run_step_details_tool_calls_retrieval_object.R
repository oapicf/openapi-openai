#' Create a new RunStepDetailsToolCallsRetrievalObject
#'
#' @description
#' RunStepDetailsToolCallsRetrievalObject Class
#'
#' @docType class
#' @title RunStepDetailsToolCallsRetrievalObject
#' @description RunStepDetailsToolCallsRetrievalObject Class
#' @format An \code{R6Class} generator object
#' @field id The ID of the tool call object. character
#' @field type The type of tool call. This is always going to be `retrieval` for this type of tool call. character
#' @field retrieval For now, this is always going to be an empty object. object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsRetrievalObject <- R6::R6Class(
  "RunStepDetailsToolCallsRetrievalObject",
  public = list(
    `id` = NULL,
    `type` = NULL,
    `retrieval` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsRetrievalObject class.
    #'
    #' @param id The ID of the tool call object.
    #' @param type The type of tool call. This is always going to be `retrieval` for this type of tool call.
    #' @param retrieval For now, this is always going to be an empty object.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `type`, `retrieval`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
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
      if (!missing(`retrieval`)) {
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
    #' @return RunStepDetailsToolCallsRetrievalObject as a base R list.
    #' @examples
    #' # convert array of RunStepDetailsToolCallsRetrievalObject (x) to a data frame
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
    #' Convert RunStepDetailsToolCallsRetrievalObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDetailsToolCallsRetrievalObjectObject <- list()
      if (!is.null(self$`id`)) {
        RunStepDetailsToolCallsRetrievalObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        RunStepDetailsToolCallsRetrievalObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`retrieval`)) {
        RunStepDetailsToolCallsRetrievalObjectObject[["retrieval"]] <-
          self$`retrieval`
      }
      return(RunStepDetailsToolCallsRetrievalObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsRetrievalObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsRetrievalObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
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
    #' @return RunStepDetailsToolCallsRetrievalObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsRetrievalObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsRetrievalObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("retrieval"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"retrieval\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`retrieval` <- this_object$`retrieval`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsRetrievalObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsRetrievalObject: the required field `id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsRetrievalObject: the required field `type` is missing."))
      }
      # check the required field `retrieval`
      if (!is.null(input_json$`retrieval`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsRetrievalObject: the required field `retrieval` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsRetrievalObject
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

      # check if the required `retrieval` is null
      if (is.null(self$`retrieval`)) {
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

      # check if the required `retrieval` is null
      if (is.null(self$`retrieval`)) {
        invalid_fields["retrieval"] <- "Non-nullable required field `retrieval` cannot be null."
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
# RunStepDetailsToolCallsRetrievalObject$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsRetrievalObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsRetrievalObject$lock()

