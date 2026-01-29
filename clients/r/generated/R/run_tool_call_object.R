#' Create a new RunToolCallObject
#'
#' @description
#' Tool call objects
#'
#' @docType class
#' @title RunToolCallObject
#' @description RunToolCallObject Class
#' @format An \code{R6Class} generator object
#' @field id The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. character
#' @field type The type of tool call the output is required for. For now, this is always `function`. character
#' @field function  \link{RunToolCallObjectFunction}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunToolCallObject <- R6::R6Class(
  "RunToolCallObject",
  public = list(
    `id` = NULL,
    `type` = NULL,
    `function` = NULL,

    #' @description
    #' Initialize a new RunToolCallObject class.
    #'
    #' @param id The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
    #' @param type The type of tool call the output is required for. For now, this is always `function`.
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
    #' @return RunToolCallObject as a base R list.
    #' @examples
    #' # convert array of RunToolCallObject (x) to a data frame
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
    #' Convert RunToolCallObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunToolCallObjectObject <- list()
      if (!is.null(self$`id`)) {
        RunToolCallObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        RunToolCallObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`function`)) {
        RunToolCallObjectObject[["function"]] <-
          self$`function`$toSimpleType()
      }
      return(RunToolCallObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunToolCallObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunToolCallObject
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
        `Function__object` <- RunToolCallObjectFunction$new()
        `Function__object`$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
        self$`function` <- `Function__object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunToolCallObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunToolCallObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunToolCallObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("function"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"function\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`function` <- RunToolCallObjectFunction$new()$fromJSON(jsonlite::toJSON(this_object$`function`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunToolCallObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunToolCallObject: the required field `id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunToolCallObject: the required field `type` is missing."))
      }
      # check the required field `function`
      if (!is.null(input_json$`function`)) {
        stopifnot(R6::is.R6(input_json$`function`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunToolCallObject: the required field `function` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunToolCallObject
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
# RunToolCallObject$unlock()
#
## Below is an example to define the print function
# RunToolCallObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunToolCallObject$lock()

