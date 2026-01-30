#' Create a new InviteRequest
#'
#' @description
#' InviteRequest Class
#'
#' @docType class
#' @title InviteRequest
#' @description InviteRequest Class
#' @format An \code{R6Class} generator object
#' @field email Send an email to this address character
#' @field role `owner` or `reader` character
#' @field projects An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior. list(\link{InviteRequestProjectsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
InviteRequest <- R6::R6Class(
  "InviteRequest",
  public = list(
    `email` = NULL,
    `role` = NULL,
    `projects` = NULL,

    #' @description
    #' Initialize a new InviteRequest class.
    #'
    #' @param email Send an email to this address
    #' @param role `owner` or `reader`
    #' @param projects An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
    #' @param ... Other optional arguments.
    initialize = function(`email`, `role`, `projects` = NULL, ...) {
      if (!missing(`email`)) {
        if (!(is.character(`email`) && length(`email`) == 1)) {
          stop(paste("Error! Invalid data for `email`. Must be a string:", `email`))
        }
        self$`email` <- `email`
      }
      if (!missing(`role`)) {
        if (!(`role` %in% c("reader", "owner"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"reader\", \"owner\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
      }
      if (!is.null(`projects`)) {
        stopifnot(is.vector(`projects`), length(`projects`) != 0)
        sapply(`projects`, function(x) stopifnot(R6::is.R6(x)))
        self$`projects` <- `projects`
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
    #' @return InviteRequest as a base R list.
    #' @examples
    #' # convert array of InviteRequest (x) to a data frame
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
    #' Convert InviteRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InviteRequestObject <- list()
      if (!is.null(self$`email`)) {
        InviteRequestObject[["email"]] <-
          self$`email`
      }
      if (!is.null(self$`role`)) {
        InviteRequestObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`projects`)) {
        InviteRequestObject[["projects"]] <-
          lapply(self$`projects`, function(x) x$toSimpleType())
      }
      return(InviteRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`email`)) {
        self$`email` <- this_object$`email`
      }
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("reader", "owner"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"reader\", \"owner\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`projects`)) {
        self$`projects` <- ApiClient$new()$deserializeObj(this_object$`projects`, "array[InviteRequestProjectsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return InviteRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of InviteRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of InviteRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`email` <- this_object$`email`
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("reader", "owner"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"reader\", \"owner\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`projects` <- ApiClient$new()$deserializeObj(this_object$`projects`, "array[InviteRequestProjectsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to InviteRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `email`
      if (!is.null(input_json$`email`)) {
        if (!(is.character(input_json$`email`) && length(input_json$`email`) == 1)) {
          stop(paste("Error! Invalid data for `email`. Must be a string:", input_json$`email`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for InviteRequest: the required field `email` is missing."))
      }
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for InviteRequest: the required field `role` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of InviteRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `email` is null
      if (is.null(self$`email`)) {
        return(FALSE)
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
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
      # check if the required `email` is null
      if (is.null(self$`email`)) {
        invalid_fields["email"] <- "Non-nullable required field `email` cannot be null."
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        invalid_fields["role"] <- "Non-nullable required field `role` cannot be null."
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
# InviteRequest$unlock()
#
## Below is an example to define the print function
# InviteRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# InviteRequest$lock()

