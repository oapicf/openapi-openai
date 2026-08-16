//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageStreamEventOneOf3 {
  /// Returns a new [MessageStreamEventOneOf3] instance.
  MessageStreamEventOneOf3({
    required this.event,
    required this.data,
  });

  MessageStreamEventOneOf3EventEnum event;

  MessageObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageStreamEventOneOf3 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'MessageStreamEventOneOf3[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [MessageStreamEventOneOf3] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageStreamEventOneOf3? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageStreamEventOneOf3[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageStreamEventOneOf3[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageStreamEventOneOf3(
        event: MessageStreamEventOneOf3EventEnum.fromJson(json[r'event'])!,
        data: MessageObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<MessageStreamEventOneOf3> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageStreamEventOneOf3>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageStreamEventOneOf3.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageStreamEventOneOf3> mapFromJson(dynamic json) {
    final map = <String, MessageStreamEventOneOf3>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageStreamEventOneOf3.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageStreamEventOneOf3-objects as value to a dart map
  static Map<String, List<MessageStreamEventOneOf3>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageStreamEventOneOf3>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageStreamEventOneOf3.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event',
    'data',
  };
}


class MessageStreamEventOneOf3EventEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageStreamEventOneOf3EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodMessagePeriodCompleted = MessageStreamEventOneOf3EventEnum._(r'thread.message.completed');

  /// List of all possible values in this [enum][MessageStreamEventOneOf3EventEnum].
  static const values = <MessageStreamEventOneOf3EventEnum>[
    threadPeriodMessagePeriodCompleted,
  ];

  static MessageStreamEventOneOf3EventEnum? fromJson(dynamic value) => MessageStreamEventOneOf3EventEnumTypeTransformer().decode(value);

  static List<MessageStreamEventOneOf3EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageStreamEventOneOf3EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageStreamEventOneOf3EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageStreamEventOneOf3EventEnum] to String,
/// and [decode] dynamic data back to [MessageStreamEventOneOf3EventEnum].
class MessageStreamEventOneOf3EventEnumTypeTransformer {
  factory MessageStreamEventOneOf3EventEnumTypeTransformer() => _instance ??= const MessageStreamEventOneOf3EventEnumTypeTransformer._();

  const MessageStreamEventOneOf3EventEnumTypeTransformer._();

  String encode(MessageStreamEventOneOf3EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageStreamEventOneOf3EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageStreamEventOneOf3EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.message.completed': return MessageStreamEventOneOf3EventEnum.threadPeriodMessagePeriodCompleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageStreamEventOneOf3EventEnumTypeTransformer] instance.
  static MessageStreamEventOneOf3EventEnumTypeTransformer? _instance;
}


