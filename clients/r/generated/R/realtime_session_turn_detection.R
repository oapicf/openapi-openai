#' Create a new RealtimeSessionTurnDetection
#'
#' @description
#' Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
#'
#' @docType class
#' @title RealtimeSessionTurnDetection
#' @description RealtimeSessionTurnDetection Class
#' @format An \code{R6Class} generator object
#' @field type Type of turn detection, only `server_vad` is currently supported. character [optional]
#' @field threshold Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. numeric [optional]
#' @field prefix_padding_ms Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. integer [optional]
#' @field silence_duration_ms Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeSessionTurnDetection <- R6::R6Class(
  "RealtimeSessionTurnDetection",
  public = list(
    `type` = NULL,
    `threshold` = NULL,
    `prefix_padding_ms` = NULL,
    `silence_duration_ms` = NULL,

    #' @description
    #' Initialize a new RealtimeSessionTurnDetection class.
    #'
    #' @param type Type of turn detection, only `server_vad` is currently supported.
    #' @param threshold Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.
    #' @param prefix_padding_ms Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.
    #' @param silence_duration_ms Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `threshold` = NULL, `prefix_padding_ms` = NULL, `silence_duration_ms` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(`type` %in% c("server_vad"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"server_vad\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`threshold`)) {
        self$`threshold` <- `threshold`
      }
      if (!is.null(`prefix_padding_ms`)) {
        if (!(is.numeric(`prefix_padding_ms`) && length(`prefix_padding_ms`) == 1)) {
          stop(paste("Error! Invalid data for `prefix_padding_ms`. Must be an integer:", `prefix_padding_ms`))
        }
        self$`prefix_padding_ms` <- `prefix_padding_ms`
      }
      if (!is.null(`silence_duration_ms`)) {
        if (!(is.numeric(`silence_duration_ms`) && length(`silence_duration_ms`) == 1)) {
          stop(paste("Error! Invalid data for `silence_duration_ms`. Must be an integer:", `silence_duration_ms`))
        }
        self$`silence_duration_ms` <- `silence_duration_ms`
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
    #' @return RealtimeSessionTurnDetection as a base R list.
    #' @examples
    #' # convert array of RealtimeSessionTurnDetection (x) to a data frame
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
    #' Convert RealtimeSessionTurnDetection to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeSessionTurnDetectionObject <- list()
      if (!is.null(self$`type`)) {
        RealtimeSessionTurnDetectionObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`threshold`)) {
        RealtimeSessionTurnDetectionObject[["threshold"]] <-
          self$`threshold`
      }
      if (!is.null(self$`prefix_padding_ms`)) {
        RealtimeSessionTurnDetectionObject[["prefix_padding_ms"]] <-
          self$`prefix_padding_ms`
      }
      if (!is.null(self$`silence_duration_ms`)) {
        RealtimeSessionTurnDetectionObject[["silence_duration_ms"]] <-
          self$`silence_duration_ms`
      }
      return(RealtimeSessionTurnDetectionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeSessionTurnDetection
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeSessionTurnDetection
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("server_vad"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"server_vad\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`threshold`)) {
        self$`threshold` <- this_object$`threshold`
      }
      if (!is.null(this_object$`prefix_padding_ms`)) {
        self$`prefix_padding_ms` <- this_object$`prefix_padding_ms`
      }
      if (!is.null(this_object$`silence_duration_ms`)) {
        self$`silence_duration_ms` <- this_object$`silence_duration_ms`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeSessionTurnDetection in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeSessionTurnDetection
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeSessionTurnDetection
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("server_vad"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"server_vad\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`threshold` <- this_object$`threshold`
      self$`prefix_padding_ms` <- this_object$`prefix_padding_ms`
      self$`silence_duration_ms` <- this_object$`silence_duration_ms`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeSessionTurnDetection and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeSessionTurnDetection
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# RealtimeSessionTurnDetection$unlock()
#
## Below is an example to define the print function
# RealtimeSessionTurnDetection$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeSessionTurnDetection$lock()

