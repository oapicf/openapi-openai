#' Create a new InviteListResponse
#'
#' @description
#' InviteListResponse Class
#'
#' @docType class
#' @title InviteListResponse
#' @description InviteListResponse Class
#' @format An \code{R6Class} generator object
#' @field object The object type, which is always `list` character
#' @field data  list(\link{Invite})
#' @field first_id The first `invite_id` in the retrieved `list` character [optional]
#' @field last_id The last `invite_id` in the retrieved `list` character [optional]
#' @field has_more The `has_more` property is used for pagination to indicate there are additional results. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InviteListResponse <- R6::R6Class(
  "InviteListResponse",
  public = list(
    `object` = NULL,
    `data` = NULL,
    `first_id` = NULL,
    `last_id` = NULL,
    `has_more` = NULL,

    #' @description
    #' Initialize a new InviteListResponse class.
    #'
    #' @param object The object type, which is always `list`
    #' @param data data
    #' @param first_id The first `invite_id` in the retrieved `list`
    #' @param last_id The last `invite_id` in the retrieved `list`
    #' @param has_more The `has_more` property is used for pagination to indicate there are additional results.
    #' @param ... Other optional arguments.
    initialize = function(`object`, `data`, `first_id` = NULL, `last_id` = NULL, `has_more` = NULL, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("list"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"list\".", sep = ""))
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
      if (!is.null(`first_id`)) {
        if (!(is.character(`first_id`) && length(`first_id`) == 1)) {
          stop(paste("Error! Invalid data for `first_id`. Must be a string:", `first_id`))
        }
        self$`first_id` <- `first_id`
      }
      if (!is.null(`last_id`)) {
        if (!(is.character(`last_id`) && length(`last_id`) == 1)) {
          stop(paste("Error! Invalid data for `last_id`. Must be a string:", `last_id`))
        }
        self$`last_id` <- `last_id`
      }
      if (!is.null(`has_more`)) {
        if (!(is.logical(`has_more`) && length(`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", `has_more`))
        }
        self$`has_more` <- `has_more`
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
    #' @return InviteListResponse as a base R list.
    #' @examples
    #' # convert array of InviteListResponse (x) to a data frame
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
    #' Convert InviteListResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InviteListResponseObject <- list()
      if (!is.null(self$`object`)) {
        InviteListResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`data`)) {
        InviteListResponseObject[["data"]] <-
          lapply(self$`data`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`first_id`)) {
        InviteListResponseObject[["first_id"]] <-
          self$`first_id`
      }
      if (!is.null(self$`last_id`)) {
        InviteListResponseObject[["last_id"]] <-
          self$`last_id`
      }
      if (!is.null(self$`has_more`)) {
        InviteListResponseObject[["has_more"]] <-
          self$`has_more`
      }
      return(InviteListResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteListResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteListResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("list"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"list\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[Invite]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`first_id`)) {
        self$`first_id` <- this_object$`first_id`
      }
      if (!is.null(this_object$`last_id`)) {
        self$`last_id` <- this_object$`last_id`
      }
      if (!is.null(this_object$`has_more`)) {
        self$`has_more` <- this_object$`has_more`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return InviteListResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteListResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteListResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("list"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"list\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[Invite]", loadNamespace("openapi"))
      self$`first_id` <- this_object$`first_id`
      self$`last_id` <- this_object$`last_id`
      self$`has_more` <- this_object$`has_more`
      self
    },

    #' @description
    #' Validate JSON input with respect to InviteListResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for InviteListResponse: the required field `object` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(is.vector(input_json$`data`), length(input_json$`data`) != 0)
        tmp <- sapply(input_json$`data`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for InviteListResponse: the required field `data` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InviteListResponse
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
# InviteListResponse$unlock()
#
## Below is an example to define the print function
# InviteListResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InviteListResponse$lock()

