#' Create a new UsageResponse
#'
#' @description
#' UsageResponse Class
#'
#' @docType class
#' @title UsageResponse
#' @description UsageResponse Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field data  list(\link{UsageTimeBucket})
#' @field has_more  character
#' @field next_page  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UsageResponse <- R6::R6Class(
  "UsageResponse",
  public = list(
    `object` = NULL,
    `data` = NULL,
    `has_more` = NULL,
    `next_page` = NULL,

    #' @description
    #' Initialize a new UsageResponse class.
    #'
    #' @param object object
    #' @param data data
    #' @param has_more has_more
    #' @param next_page next_page
    #' @param ... Other optional arguments.
    initialize = function(`object`, `data`, `has_more`, `next_page`, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("page"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"page\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
      }
      if (!missing(`has_more`)) {
        if (!(is.logical(`has_more`) && length(`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", `has_more`))
        }
        self$`has_more` <- `has_more`
      }
      if (!missing(`next_page`)) {
        if (!(is.character(`next_page`) && length(`next_page`) == 1)) {
          stop(paste("Error! Invalid data for `next_page`. Must be a string:", `next_page`))
        }
        self$`next_page` <- `next_page`
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
    #' @return UsageResponse as a base R list.
    #' @examples
    #' # convert array of UsageResponse (x) to a data frame
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
    #' Convert UsageResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UsageResponseObject <- list()
      if (!is.null(self$`object`)) {
        UsageResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`data`)) {
        UsageResponseObject[["data"]] <-
          lapply(self$`data`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`has_more`)) {
        UsageResponseObject[["has_more"]] <-
          self$`has_more`
      }
      if (!is.null(self$`next_page`)) {
        UsageResponseObject[["next_page"]] <-
          self$`next_page`
      }
      return(UsageResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("page"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"page\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[UsageTimeBucket]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`has_more`)) {
        self$`has_more` <- this_object$`has_more`
      }
      if (!is.null(this_object$`next_page`)) {
        self$`next_page` <- this_object$`next_page`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UsageResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("page"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"page\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[UsageTimeBucket]", loadNamespace("openapi"))
      self$`has_more` <- this_object$`has_more`
      self$`next_page` <- this_object$`next_page`
      self
    },

    #' @description
    #' Validate JSON input with respect to UsageResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UsageResponse: the required field `object` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(is.vector(input_json$`data`), length(input_json$`data`) != 0)
        tmp <- sapply(input_json$`data`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageResponse: the required field `data` is missing."))
      }
      # check the required field `has_more`
      if (!is.null(input_json$`has_more`)) {
        if (!(is.logical(input_json$`has_more`) && length(input_json$`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", input_json$`has_more`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageResponse: the required field `has_more` is missing."))
      }
      # check the required field `next_page`
      if (!is.null(input_json$`next_page`)) {
        if (!(is.character(input_json$`next_page`) && length(input_json$`next_page`) == 1)) {
          stop(paste("Error! Invalid data for `next_page`. Must be a string:", input_json$`next_page`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageResponse: the required field `next_page` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UsageResponse
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

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      # check if the required `has_more` is null
      if (is.null(self$`has_more`)) {
        return(FALSE)
      }

      # check if the required `next_page` is null
      if (is.null(self$`next_page`)) {
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

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      # check if the required `has_more` is null
      if (is.null(self$`has_more`)) {
        invalid_fields["has_more"] <- "Non-nullable required field `has_more` cannot be null."
      }

      # check if the required `next_page` is null
      if (is.null(self$`next_page`)) {
        invalid_fields["next_page"] <- "Non-nullable required field `next_page` cannot be null."
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
# UsageResponse$unlock()
#
## Below is an example to define the print function
# UsageResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UsageResponse$lock()

