#' Create a new RunStepDeltaStepDetailsToolCallsFunctionObject
#'
#' @description
#' RunStepDeltaStepDetailsToolCallsFunctionObject Class
#'
#' @docType class
#' @title RunStepDeltaStepDetailsToolCallsFunctionObject
#' @description RunStepDeltaStepDetailsToolCallsFunctionObject Class
#' @format An \code{R6Class} generator object
#' @field index The index of the tool call in the tool calls array. integer
#' @field id The ID of the tool call object. character [optional]
#' @field type The type of tool call. This is always going to be `function` for this type of tool call. character
#' @field function  \link{RunStepDeltaStepDetailsToolCallsFunctionObjectFunction} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDeltaStepDetailsToolCallsFunctionObject <- R6::R6Class(
  "RunStepDeltaStepDetailsToolCallsFunctionObject",
  public = list(
    `index` = NULL,
    `id` = NULL,
    `type` = NULL,
    `function` = NULL,

    #' @description
    #' Initialize a new RunStepDeltaStepDetailsToolCallsFunctionObject class.
    #'
    #' @param index The index of the tool call in the tool calls array.
    #' @param type The type of tool call. This is always going to be `function` for this type of tool call.
    #' @param id The ID of the tool call object.
    #' @param function function
    #' @param ... Other optional arguments.
    initialize = function(`index`, `type`, `id` = NULL, `function` = NULL, ...) {
      if (!missing(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
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
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`function`)) {
        stopifnot(R6::is.R6(`function`))
        self$`function` <- `function`
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
    #' @return RunStepDeltaStepDetailsToolCallsFunctionObject as a base R list.
    #' @examples
    #' # convert array of RunStepDeltaStepDetailsToolCallsFunctionObject (x) to a data frame
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
    #' Convert RunStepDeltaStepDetailsToolCallsFunctionObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDeltaStepDetailsToolCallsFunctionObjectObject <- list()
      if (!is.null(self$`index`)) {
        RunStepDeltaStepDetailsToolCallsFunctionObjectObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`id`)) {
        RunStepDeltaStepDetailsToolCallsFunctionObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        RunStepDeltaStepDetailsToolCallsFunctionObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`function`)) {
        RunStepDeltaStepDetailsToolCallsFunctionObjectObject[["function"]] <-
          self$`function`$toSimpleType()
      }
      return(RunStepDeltaStepDetailsToolCallsFunctionObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsFunctionObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsFunctionObject
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
        `Function__object` <- RunStepDeltaStepDetailsToolCallsFunctionObjectFunction$new()
        `Function__object`$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
        self$`function` <- `Function__object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDeltaStepDetailsToolCallsFunctionObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDeltaStepDetailsToolCallsFunctionObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDeltaStepDetailsToolCallsFunctionObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`index` <- this_object$`index`
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`function` <- RunStepDeltaStepDetailsToolCallsFunctionObjectFunction$new()$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDeltaStepDetailsToolCallsFunctionObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunStepDeltaStepDetailsToolCallsFunctionObject: the required field `index` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDeltaStepDetailsToolCallsFunctionObject: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDeltaStepDetailsToolCallsFunctionObject
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
# RunStepDeltaStepDetailsToolCallsFunctionObject$unlock()
#
## Below is an example to define the print function
# RunStepDeltaStepDetailsToolCallsFunctionObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDeltaStepDetailsToolCallsFunctionObject$lock()

