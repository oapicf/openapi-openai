#' Create a new UsageTimeBucket
#'
#' @description
#' UsageTimeBucket Class
#'
#' @docType class
#' @title UsageTimeBucket
#' @description UsageTimeBucket Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field start_time  integer
#' @field end_time  integer
#' @field result  list(\link{UsageTimeBucketResultInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UsageTimeBucket <- R6::R6Class(
  "UsageTimeBucket",
  public = list(
    `object` = NULL,
    `start_time` = NULL,
    `end_time` = NULL,
    `result` = NULL,

    #' @description
    #' Initialize a new UsageTimeBucket class.
    #'
    #' @param object object
    #' @param start_time start_time
    #' @param end_time end_time
    #' @param result result
    #' @param ... Other optional arguments.
    initialize = function(`object`, `start_time`, `end_time`, `result`, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("bucket"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"bucket\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`start_time`)) {
        if (!(is.numeric(`start_time`) && length(`start_time`) == 1)) {
          stop(paste("Error! Invalid data for `start_time`. Must be an integer:", `start_time`))
        }
        self$`start_time` <- `start_time`
      }
      if (!missing(`end_time`)) {
        if (!(is.numeric(`end_time`) && length(`end_time`) == 1)) {
          stop(paste("Error! Invalid data for `end_time`. Must be an integer:", `end_time`))
        }
        self$`end_time` <- `end_time`
      }
      if (!missing(`result`)) {
        stopifnot(is.vector(`result`), length(`result`) != 0)
        sapply(`result`, function(x) stopifnot(R6::is.R6(x)))
        self$`result` <- `result`
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
    #' @return UsageTimeBucket as a base R list.
    #' @examples
    #' # convert array of UsageTimeBucket (x) to a data frame
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
    #' Convert UsageTimeBucket to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UsageTimeBucketObject <- list()
      if (!is.null(self$`object`)) {
        UsageTimeBucketObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`start_time`)) {
        UsageTimeBucketObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`end_time`)) {
        UsageTimeBucketObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`result`)) {
        UsageTimeBucketObject[["result"]] <-
          lapply(self$`result`, function(x) x$toSimpleType())
      }
      return(UsageTimeBucketObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageTimeBucket
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageTimeBucket
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("bucket"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"bucket\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`result`)) {
        self$`result` <- ApiClient$new()$deserializeObj(this_object$`result`, "array[UsageTimeBucketResultInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UsageTimeBucket in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageTimeBucket
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageTimeBucket
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("bucket"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"bucket\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`start_time` <- this_object$`start_time`
      self$`end_time` <- this_object$`end_time`
      self$`result` <- ApiClient$new()$deserializeObj(this_object$`result`, "array[UsageTimeBucketResultInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to UsageTimeBucket and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageTimeBucket: the required field `object` is missing."))
      }
      # check the required field `start_time`
      if (!is.null(input_json$`start_time`)) {
        if (!(is.numeric(input_json$`start_time`) && length(input_json$`start_time`) == 1)) {
          stop(paste("Error! Invalid data for `start_time`. Must be an integer:", input_json$`start_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageTimeBucket: the required field `start_time` is missing."))
      }
      # check the required field `end_time`
      if (!is.null(input_json$`end_time`)) {
        if (!(is.numeric(input_json$`end_time`) && length(input_json$`end_time`) == 1)) {
          stop(paste("Error! Invalid data for `end_time`. Must be an integer:", input_json$`end_time`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageTimeBucket: the required field `end_time` is missing."))
      }
      # check the required field `result`
      if (!is.null(input_json$`result`)) {
        stopifnot(is.vector(input_json$`result`), length(input_json$`result`) != 0)
        tmp <- sapply(input_json$`result`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageTimeBucket: the required field `result` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UsageTimeBucket
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `start_time` is null
      if (is.null(self$`start_time`)) {
        return(FALSE)
      }

      # check if the required `end_time` is null
      if (is.null(self$`end_time`)) {
        return(FALSE)
      }

      # check if the required `result` is null
      if (is.null(self$`result`)) {
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `start_time` is null
      if (is.null(self$`start_time`)) {
        invalid_fields["start_time"] <- "Non-nullable required field `start_time` cannot be null."
      }

      # check if the required `end_time` is null
      if (is.null(self$`end_time`)) {
        invalid_fields["end_time"] <- "Non-nullable required field `end_time` cannot be null."
      }

      # check if the required `result` is null
      if (is.null(self$`result`)) {
        invalid_fields["result"] <- "Non-nullable required field `result` cannot be null."
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
# UsageTimeBucket$unlock()
#
## Below is an example to define the print function
# UsageTimeBucket$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UsageTimeBucket$lock()

