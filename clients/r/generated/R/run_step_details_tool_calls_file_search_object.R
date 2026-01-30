#' Create a new RunStepDetailsToolCallsFileSearchObject
#'
#' @description
#' RunStepDetailsToolCallsFileSearchObject Class
#'
#' @docType class
#' @title RunStepDetailsToolCallsFileSearchObject
#' @description RunStepDetailsToolCallsFileSearchObject Class
#' @format An \code{R6Class} generator object
#' @field id The ID of the tool call object. character
#' @field type The type of tool call. This is always going to be `file_search` for this type of tool call. character
#' @field file_search  \link{RunStepDetailsToolCallsFileSearchObjectFileSearch}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsFileSearchObject <- R6::R6Class(
  "RunStepDetailsToolCallsFileSearchObject",
  public = list(
    `id` = NULL,
    `type` = NULL,
    `file_search` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsFileSearchObject class.
    #'
    #' @param id The ID of the tool call object.
    #' @param type The type of tool call. This is always going to be `file_search` for this type of tool call.
    #' @param file_search file_search
    #' @param ... Other optional arguments.
    initialize = function(`id`, `type`, `file_search`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("file_search"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"file_search\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`file_search`)) {
        stopifnot(R6::is.R6(`file_search`))
        self$`file_search` <- `file_search`
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
    #' @return RunStepDetailsToolCallsFileSearchObject as a base R list.
    #' @examples
    #' # convert array of RunStepDetailsToolCallsFileSearchObject (x) to a data frame
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
    #' Convert RunStepDetailsToolCallsFileSearchObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDetailsToolCallsFileSearchObjectObject <- list()
      if (!is.null(self$`id`)) {
        RunStepDetailsToolCallsFileSearchObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        RunStepDetailsToolCallsFileSearchObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`file_search`)) {
        RunStepDetailsToolCallsFileSearchObjectObject[["file_search"]] <-
          self$`file_search`$toSimpleType()
      }
      return(RunStepDetailsToolCallsFileSearchObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFileSearchObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFileSearchObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("file_search"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"file_search\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`file_search`)) {
        `file_search_object` <- RunStepDetailsToolCallsFileSearchObjectFileSearch$new()
        `file_search_object`$fromJSON(jsonlite::toJSON(this_object$`file_search`, auto_unbox = TRUE, digits = NA))
        self$`file_search` <- `file_search_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDetailsToolCallsFileSearchObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsFileSearchObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsFileSearchObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("file_search"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"file_search\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`file_search` <- RunStepDetailsToolCallsFileSearchObjectFileSearch$new()$fromJSON(jsonlite::toJSON(this_object$`file_search`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsFileSearchObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFileSearchObject: the required field `id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFileSearchObject: the required field `type` is missing."))
      }
      # check the required field `file_search`
      if (!is.null(input_json$`file_search`)) {
        stopifnot(R6::is.R6(input_json$`file_search`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsFileSearchObject: the required field `file_search` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsFileSearchObject
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

      # check if the required `file_search` is null
      if (is.null(self$`file_search`)) {
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

      # check if the required `file_search` is null
      if (is.null(self$`file_search`)) {
        invalid_fields["file_search"] <- "Non-nullable required field `file_search` cannot be null."
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
# RunStepDetailsToolCallsFileSearchObject$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsFileSearchObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsFileSearchObject$lock()

