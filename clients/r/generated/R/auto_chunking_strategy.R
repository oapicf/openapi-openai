#' Create a new AutoChunkingStrategy
#'
#' @description
#' The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
#'
#' @docType class
#' @title AutoChunkingStrategy
#' @description AutoChunkingStrategy Class
#' @format An \code{R6Class} generator object
#' @field type Always `auto`. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AutoChunkingStrategy <- R6::R6Class(
  "AutoChunkingStrategy",
  public = list(
    `type` = NULL,

    #' @description
    #' Initialize a new AutoChunkingStrategy class.
    #'
    #' @param type Always `auto`.
    #' @param ... Other optional arguments.
    initialize = function(`type`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("auto"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"auto\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
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
    #' @return AutoChunkingStrategy as a base R list.
    #' @examples
    #' # convert array of AutoChunkingStrategy (x) to a data frame
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
    #' Convert AutoChunkingStrategy to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AutoChunkingStrategyObject <- list()
      if (!is.null(self$`type`)) {
        AutoChunkingStrategyObject[["type"]] <-
          self$`type`
      }
      return(AutoChunkingStrategyObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AutoChunkingStrategy
    #'
    #' @param input_json the JSON input
    #' @return the instance of AutoChunkingStrategy
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("auto"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"auto\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AutoChunkingStrategy in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AutoChunkingStrategy
    #'
    #' @param input_json the JSON input
    #' @return the instance of AutoChunkingStrategy
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("auto"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"auto\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self
    },

    #' @description
    #' Validate JSON input with respect to AutoChunkingStrategy and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AutoChunkingStrategy: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AutoChunkingStrategy
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
# AutoChunkingStrategy$unlock()
#
## Below is an example to define the print function
# AutoChunkingStrategy$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AutoChunkingStrategy$lock()

