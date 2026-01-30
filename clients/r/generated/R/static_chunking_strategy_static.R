#' Create a new StaticChunkingStrategyStatic
#'
#' @description
#' StaticChunkingStrategyStatic Class
#'
#' @docType class
#' @title StaticChunkingStrategyStatic
#' @description StaticChunkingStrategyStatic Class
#' @format An \code{R6Class} generator object
#' @field max_chunk_size_tokens The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`. integer
#' @field chunk_overlap_tokens The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
StaticChunkingStrategyStatic <- R6::R6Class(
  "StaticChunkingStrategyStatic",
  public = list(
    `max_chunk_size_tokens` = NULL,
    `chunk_overlap_tokens` = NULL,

    #' @description
    #' Initialize a new StaticChunkingStrategyStatic class.
    #'
    #' @param max_chunk_size_tokens The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
    #' @param chunk_overlap_tokens The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`.
    #' @param ... Other optional arguments.
    initialize = function(`max_chunk_size_tokens`, `chunk_overlap_tokens`, ...) {
      if (!missing(`max_chunk_size_tokens`)) {
        if (!(is.numeric(`max_chunk_size_tokens`) && length(`max_chunk_size_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `max_chunk_size_tokens`. Must be an integer:", `max_chunk_size_tokens`))
        }
        self$`max_chunk_size_tokens` <- `max_chunk_size_tokens`
      }
      if (!missing(`chunk_overlap_tokens`)) {
        if (!(is.numeric(`chunk_overlap_tokens`) && length(`chunk_overlap_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `chunk_overlap_tokens`. Must be an integer:", `chunk_overlap_tokens`))
        }
        self$`chunk_overlap_tokens` <- `chunk_overlap_tokens`
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
    #' @return StaticChunkingStrategyStatic as a base R list.
    #' @examples
    #' # convert array of StaticChunkingStrategyStatic (x) to a data frame
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
    #' Convert StaticChunkingStrategyStatic to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      StaticChunkingStrategyStaticObject <- list()
      if (!is.null(self$`max_chunk_size_tokens`)) {
        StaticChunkingStrategyStaticObject[["max_chunk_size_tokens"]] <-
          self$`max_chunk_size_tokens`
      }
      if (!is.null(self$`chunk_overlap_tokens`)) {
        StaticChunkingStrategyStaticObject[["chunk_overlap_tokens"]] <-
          self$`chunk_overlap_tokens`
      }
      return(StaticChunkingStrategyStaticObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of StaticChunkingStrategyStatic
    #'
    #' @param input_json the JSON input
    #' @return the instance of StaticChunkingStrategyStatic
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`max_chunk_size_tokens`)) {
        self$`max_chunk_size_tokens` <- this_object$`max_chunk_size_tokens`
      }
      if (!is.null(this_object$`chunk_overlap_tokens`)) {
        self$`chunk_overlap_tokens` <- this_object$`chunk_overlap_tokens`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return StaticChunkingStrategyStatic in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of StaticChunkingStrategyStatic
    #'
    #' @param input_json the JSON input
    #' @return the instance of StaticChunkingStrategyStatic
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`max_chunk_size_tokens` <- this_object$`max_chunk_size_tokens`
      self$`chunk_overlap_tokens` <- this_object$`chunk_overlap_tokens`
      self
    },

    #' @description
    #' Validate JSON input with respect to StaticChunkingStrategyStatic and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `max_chunk_size_tokens`
      if (!is.null(input_json$`max_chunk_size_tokens`)) {
        if (!(is.numeric(input_json$`max_chunk_size_tokens`) && length(input_json$`max_chunk_size_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `max_chunk_size_tokens`. Must be an integer:", input_json$`max_chunk_size_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StaticChunkingStrategyStatic: the required field `max_chunk_size_tokens` is missing."))
      }
      # check the required field `chunk_overlap_tokens`
      if (!is.null(input_json$`chunk_overlap_tokens`)) {
        if (!(is.numeric(input_json$`chunk_overlap_tokens`) && length(input_json$`chunk_overlap_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `chunk_overlap_tokens`. Must be an integer:", input_json$`chunk_overlap_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for StaticChunkingStrategyStatic: the required field `chunk_overlap_tokens` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of StaticChunkingStrategyStatic
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `max_chunk_size_tokens` is null
      if (is.null(self$`max_chunk_size_tokens`)) {
        return(FALSE)
      }

      if (self$`max_chunk_size_tokens` > 4096) {
        return(FALSE)
      }
      if (self$`max_chunk_size_tokens` < 100) {
        return(FALSE)
      }

      # check if the required `chunk_overlap_tokens` is null
      if (is.null(self$`chunk_overlap_tokens`)) {
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
      # check if the required `max_chunk_size_tokens` is null
      if (is.null(self$`max_chunk_size_tokens`)) {
        invalid_fields["max_chunk_size_tokens"] <- "Non-nullable required field `max_chunk_size_tokens` cannot be null."
      }

      if (self$`max_chunk_size_tokens` > 4096) {
        invalid_fields["max_chunk_size_tokens"] <- "Invalid value for `max_chunk_size_tokens`, must be smaller than or equal to 4096."
      }
      if (self$`max_chunk_size_tokens` < 100) {
        invalid_fields["max_chunk_size_tokens"] <- "Invalid value for `max_chunk_size_tokens`, must be bigger than or equal to 100."
      }

      # check if the required `chunk_overlap_tokens` is null
      if (is.null(self$`chunk_overlap_tokens`)) {
        invalid_fields["chunk_overlap_tokens"] <- "Non-nullable required field `chunk_overlap_tokens` cannot be null."
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
# StaticChunkingStrategyStatic$unlock()
#
## Below is an example to define the print function
# StaticChunkingStrategyStatic$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# StaticChunkingStrategyStatic$lock()

