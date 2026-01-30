#' Create a new FineTuneChatRequestInput
#'
#' @description
#' The per-line training example of a fine-tuning input file for chat models using the supervised method.
#'
#' @docType class
#' @title FineTuneChatRequestInput
#' @description FineTuneChatRequestInput Class
#' @format An \code{R6Class} generator object
#' @field messages  list(\link{FineTuneChatRequestInputMessagesInner}) [optional]
#' @field tools A list of tools the model may generate JSON inputs for. list(\link{ChatCompletionTool}) [optional]
#' @field parallel_tool_calls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. character [optional]
#' @field functions A list of functions the model may generate JSON inputs for. list(\link{ChatCompletionFunctions}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuneChatRequestInput <- R6::R6Class(
  "FineTuneChatRequestInput",
  public = list(
    `messages` = NULL,
    `tools` = NULL,
    `parallel_tool_calls` = NULL,
    `functions` = NULL,

    #' @description
    #' Initialize a new FineTuneChatRequestInput class.
    #'
    #' @param messages messages
    #' @param tools A list of tools the model may generate JSON inputs for.
    #' @param parallel_tool_calls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.. Default to TRUE.
    #' @param functions A list of functions the model may generate JSON inputs for.
    #' @param ... Other optional arguments.
    initialize = function(`messages` = NULL, `tools` = NULL, `parallel_tool_calls` = TRUE, `functions` = NULL, ...) {
      if (!is.null(`messages`)) {
        stopifnot(is.vector(`messages`), length(`messages`) != 0)
        sapply(`messages`, function(x) stopifnot(R6::is.R6(x)))
        self$`messages` <- `messages`
      }
      if (!is.null(`tools`)) {
        stopifnot(is.vector(`tools`), length(`tools`) != 0)
        sapply(`tools`, function(x) stopifnot(R6::is.R6(x)))
        self$`tools` <- `tools`
      }
      if (!is.null(`parallel_tool_calls`)) {
        if (!(is.logical(`parallel_tool_calls`) && length(`parallel_tool_calls`) == 1)) {
          stop(paste("Error! Invalid data for `parallel_tool_calls`. Must be a boolean:", `parallel_tool_calls`))
        }
        self$`parallel_tool_calls` <- `parallel_tool_calls`
      }
      if (!is.null(`functions`)) {
        stopifnot(is.vector(`functions`), length(`functions`) != 0)
        sapply(`functions`, function(x) stopifnot(R6::is.R6(x)))
        self$`functions` <- `functions`
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
    #' @return FineTuneChatRequestInput as a base R list.
    #' @examples
    #' # convert array of FineTuneChatRequestInput (x) to a data frame
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
    #' Convert FineTuneChatRequestInput to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTuneChatRequestInputObject <- list()
      if (!is.null(self$`messages`)) {
        FineTuneChatRequestInputObject[["messages"]] <-
          lapply(self$`messages`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`tools`)) {
        FineTuneChatRequestInputObject[["tools"]] <-
          lapply(self$`tools`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`parallel_tool_calls`)) {
        FineTuneChatRequestInputObject[["parallel_tool_calls"]] <-
          self$`parallel_tool_calls`
      }
      if (!is.null(self$`functions`)) {
        FineTuneChatRequestInputObject[["functions"]] <-
          lapply(self$`functions`, function(x) x$toSimpleType())
      }
      return(FineTuneChatRequestInputObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneChatRequestInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneChatRequestInput
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`messages`)) {
        self$`messages` <- ApiClient$new()$deserializeObj(this_object$`messages`, "array[FineTuneChatRequestInputMessagesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`tools`)) {
        self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[ChatCompletionTool]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`parallel_tool_calls`)) {
        self$`parallel_tool_calls` <- this_object$`parallel_tool_calls`
      }
      if (!is.null(this_object$`functions`)) {
        self$`functions` <- ApiClient$new()$deserializeObj(this_object$`functions`, "array[ChatCompletionFunctions]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FineTuneChatRequestInput in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuneChatRequestInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuneChatRequestInput
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`messages` <- ApiClient$new()$deserializeObj(this_object$`messages`, "array[FineTuneChatRequestInputMessagesInner]", loadNamespace("openapi"))
      self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[ChatCompletionTool]", loadNamespace("openapi"))
      self$`parallel_tool_calls` <- this_object$`parallel_tool_calls`
      self$`functions` <- ApiClient$new()$deserializeObj(this_object$`functions`, "array[ChatCompletionFunctions]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuneChatRequestInput and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuneChatRequestInput
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`messages`) < 1) {
        return(FALSE)
      }

      if (length(self$`functions`) > 128) {
        return(FALSE)
      }
      if (length(self$`functions`) < 1) {
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
      if (length(self$`messages`) < 1) {
        invalid_fields["messages"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

      if (length(self$`functions`) > 128) {
        invalid_fields["functions"] <- "Invalid length for `functions`, number of items must be less than or equal to 128."
      }
      if (length(self$`functions`) < 1) {
        invalid_fields["functions"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
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
# FineTuneChatRequestInput$unlock()
#
## Below is an example to define the print function
# FineTuneChatRequestInput$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuneChatRequestInput$lock()

