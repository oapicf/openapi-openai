//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageObjectIncompleteDetails {
  /// Returns a new [MessageObjectIncompleteDetails] instance.
  MessageObjectIncompleteDetails({
    required this.reason,
  });

  /// The reason the message is incomplete.
  MessageObjectIncompleteDetailsReasonEnum reason;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageObjectIncompleteDetails &&
    other.reason == reason;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (reason.hashCode);

  @override
  String toString() => 'MessageObjectIncompleteDetails[reason=$reason]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'reason'] = this.reason;
    return json;
  }

  /// Returns a new [MessageObjectIncompleteDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageObjectIncompleteDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageObjectIncompleteDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageObjectIncompleteDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageObjectIncompleteDetails(
        reason: MessageObjectIncompleteDetailsReasonEnum.fromJson(json[r'reason'])!,
      );
    }
    return null;
  }

  static List<MessageObjectIncompleteDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageObjectIncompleteDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageObjectIncompleteDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageObjectIncompleteDetails> mapFromJson(dynamic json) {
    final map = <String, MessageObjectIncompleteDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageObjectIncompleteDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageObjectIncompleteDetails-objects as value to a dart map
  static Map<String, List<MessageObjectIncompleteDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageObjectIncompleteDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageObjectIncompleteDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'reason',
  };
}

/// The reason the message is incomplete.
class MessageObjectIncompleteDetailsReasonEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageObjectIncompleteDetailsReasonEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const contentFilter = MessageObjectIncompleteDetailsReasonEnum._(r'content_filter');
  static const maxTokens = MessageObjectIncompleteDetailsReasonEnum._(r'max_tokens');
  static const runCancelled = MessageObjectIncompleteDetailsReasonEnum._(r'run_cancelled');
  static const runExpired = MessageObjectIncompleteDetailsReasonEnum._(r'run_expired');
  static const runFailed = MessageObjectIncompleteDetailsReasonEnum._(r'run_failed');

  /// List of all possible values in this [enum][MessageObjectIncompleteDetailsReasonEnum].
  static const values = <MessageObjectIncompleteDetailsReasonEnum>[
    contentFilter,
    maxTokens,
    runCancelled,
    runExpired,
    runFailed,
  ];

  static MessageObjectIncompleteDetailsReasonEnum? fromJson(dynamic value) => MessageObjectIncompleteDetailsReasonEnumTypeTransformer().decode(value);

  static List<MessageObjectIncompleteDetailsReasonEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageObjectIncompleteDetailsReasonEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageObjectIncompleteDetailsReasonEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageObjectIncompleteDetailsReasonEnum] to String,
/// and [decode] dynamic data back to [MessageObjectIncompleteDetailsReasonEnum].
class MessageObjectIncompleteDetailsReasonEnumTypeTransformer {
  factory MessageObjectIncompleteDetailsReasonEnumTypeTransformer() => _instance ??= const MessageObjectIncompleteDetailsReasonEnumTypeTransformer._();

  const MessageObjectIncompleteDetailsReasonEnumTypeTransformer._();

  String encode(MessageObjectIncompleteDetailsReasonEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageObjectIncompleteDetailsReasonEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageObjectIncompleteDetailsReasonEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'content_filter': return MessageObjectIncompleteDetailsReasonEnum.contentFilter;
        case r'max_tokens': return MessageObjectIncompleteDetailsReasonEnum.maxTokens;
        case r'run_cancelled': return MessageObjectIncompleteDetailsReasonEnum.runCancelled;
        case r'run_expired': return MessageObjectIncompleteDetailsReasonEnum.runExpired;
        case r'run_failed': return MessageObjectIncompleteDetailsReasonEnum.runFailed;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageObjectIncompleteDetailsReasonEnumTypeTransformer] instance.
  static MessageObjectIncompleteDetailsReasonEnumTypeTransformer? _instance;
}


