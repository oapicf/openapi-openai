//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateChatCompletionFunctionResponseChoicesInner {
  /// Returns a new [CreateChatCompletionFunctionResponseChoicesInner] instance.
  CreateChatCompletionFunctionResponseChoicesInner({
    required this.finishReason,
    required this.index,
    required this.message,
  });

  /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
  CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum finishReason;

  /// The index of the choice in the list of choices.
  int index;

  ChatCompletionResponseMessage message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateChatCompletionFunctionResponseChoicesInner &&
    other.finishReason == finishReason &&
    other.index == index &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (finishReason.hashCode) +
    (index.hashCode) +
    (message.hashCode);

  @override
  String toString() => 'CreateChatCompletionFunctionResponseChoicesInner[finishReason=$finishReason, index=$index, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'finish_reason'] = this.finishReason;
      json[r'index'] = this.index;
      json[r'message'] = this.message;
    return json;
  }

  /// Returns a new [CreateChatCompletionFunctionResponseChoicesInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateChatCompletionFunctionResponseChoicesInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'finish_reason'), 'Required key "CreateChatCompletionFunctionResponseChoicesInner[finish_reason]" is missing from JSON.');
        assert(json[r'finish_reason'] != null, 'Required key "CreateChatCompletionFunctionResponseChoicesInner[finish_reason]" has a null value in JSON.');
        assert(json.containsKey(r'index'), 'Required key "CreateChatCompletionFunctionResponseChoicesInner[index]" is missing from JSON.');
        assert(json[r'index'] != null, 'Required key "CreateChatCompletionFunctionResponseChoicesInner[index]" has a null value in JSON.');
        assert(json.containsKey(r'message'), 'Required key "CreateChatCompletionFunctionResponseChoicesInner[message]" is missing from JSON.');
        assert(json[r'message'] != null, 'Required key "CreateChatCompletionFunctionResponseChoicesInner[message]" has a null value in JSON.');
        return true;
      }());

      return CreateChatCompletionFunctionResponseChoicesInner(
        finishReason: CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum.fromJson(json[r'finish_reason'])!,
        index: mapValueOfType<int>(json, r'index')!,
        message: ChatCompletionResponseMessage.fromJson(json[r'message'])!,
      );
    }
    return null;
  }

  static List<CreateChatCompletionFunctionResponseChoicesInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionFunctionResponseChoicesInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionFunctionResponseChoicesInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateChatCompletionFunctionResponseChoicesInner> mapFromJson(dynamic json) {
    final map = <String, CreateChatCompletionFunctionResponseChoicesInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateChatCompletionFunctionResponseChoicesInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateChatCompletionFunctionResponseChoicesInner-objects as value to a dart map
  static Map<String, List<CreateChatCompletionFunctionResponseChoicesInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateChatCompletionFunctionResponseChoicesInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateChatCompletionFunctionResponseChoicesInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'finish_reason',
    'index',
    'message',
  };
}

/// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
enum CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum {
  stop._(r'stop'),
  length._(r'length'),
  functionCall._(r'function_call'),
  contentFilter._(r'content_filter'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum? fromJson(dynamic value) => CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum] to String,
/// and [decode] dynamic data back to [CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum].
class CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnumTypeTransformer {
  factory CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnumTypeTransformer() => _instance ??= const CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnumTypeTransformer._();

  const CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnumTypeTransformer._();

  String encode(CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum data) => data._value;

  /// Returns the instance of [CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'stop': return CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum.stop;
        case r'length': return CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum.length;
        case r'function_call': return CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum.functionCall;
        case r'content_filter': return CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum.contentFilter;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnumTypeTransformer? _instance;
}


