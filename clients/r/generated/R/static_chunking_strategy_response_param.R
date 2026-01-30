#' Create a new StaticChunkingStrategyResponseParam
#'
#' @description
#' StaticChunkingStrategyResponseParam Class
#'
#' @docType class
#' @title StaticChunkingStrategyResponseParam
#' @description StaticChunkingStrategyResponseParam Class
#' @format An \code{R6Class} generator object
#' @field type Always `static`. character
#' @field static  \link{StaticChunkingStrategy}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
StaticChunkingStrategyResponseParam <- R6::R6Class(
  "StaticChunkingStrategyResponseParam",
  public = list(
    `type` = NULL,
    `static` = NULL,

    #' @description
    #' Initialize a new StaticChunkingStrategyResponseParam class.
    #'
    #' @param type Always `static`.
    #' @param static static
    #' @param ... Other optional arguments.
    initialize = function(`type`, `static`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("static"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"static\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`static`)) {
        stopifnot(R6::is.R6(`static`))
        self$`static` <- `static`
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
    #' @return StaticChunkingStrategyResponseParam as a base R list.
    #' @examples
    #' # convert array of StaticChunkingStrategyResponseParam (x) to a data frame
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
    #' Convert StaticChunkingStrategyResponseParam to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      StaticChunkingStrategyResponseParamObject <- list()
      if (!is.null(self$`type`)) {
        StaticChunkingStrategyResponseParamObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`static`)) {
        StaticChunkingStrategyResponseParamObject[["static"]] <-
          self$`static`$toSimpleType()
      }
      return(StaticChunkingStrategyResponseParamObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of StaticChunkingStrategyResponseParam
    #'
    #' @param input_json the JSON input
    #' @return the instance of StaticChunkingStrategyResponseParam
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("static"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"static\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`static`)) {
        `static_object` <- StaticChunkingStrategy$new()
        `static_object`$fromJSON(jsonlite::toJSON(this_object$`static`, auto_unbox = TRUE, digits = NA))
        self$`static` <- `static_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return StaticChunkingStrategyResponseParam in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of StaticChunkingStrategyResponseParam
    #'
    #' @param input_json the JSON input
    #' @return the instance of StaticChunkingStrategyResponseParam
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("static"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"static\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`static` <- StaticChunkingStrategy$new()$fromJSON(jsonlite::toJSON(this_object$`static`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to StaticChunkingStrategyResponseParam and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StaticChunkingStrategyResponseParam: the required field `type` is missing."))
      }
      # check the required field `static`
      if (!is.null(input_json$`static`)) {
        stopifnot(R6::is.R6(input_json$`static`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StaticChunkingStrategyResponseParam: the required field `static` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of StaticChunkingStrategyResponseParam
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `static` is null
      if (is.null(self$`static`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `static` is null
      if (is.null(self$`static`)) {
        invalid_fields["static"] <- "Non-nullable required field `static` cannot be null."
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
# StaticChunkingStrategyResponseParam$unlock()
#
## Below is an example to define the print function
# StaticChunkingStrategyResponseParam$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# StaticChunkingStrategyResponseParam$lock()

