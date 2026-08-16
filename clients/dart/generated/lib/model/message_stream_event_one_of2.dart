//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageStreamEventOneOf2 {
  /// Returns a new [MessageStreamEventOneOf2] instance.
  MessageStreamEventOneOf2({
    required this.event,
    required this.data,
  });

  MessageStreamEventOneOf2EventEnum event;

  MessageDeltaObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageStreamEventOneOf2 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'MessageStreamEventOneOf2[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [MessageStreamEventOneOf2] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageStreamEventOneOf2? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageStreamEventOneOf2[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageStreamEventOneOf2[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageStreamEventOneOf2(
        event: MessageStreamEventOneOf2EventEnum.fromJson(json[r'event'])!,
        data: MessageDeltaObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<MessageStreamEventOneOf2> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageStreamEventOneOf2>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageStreamEventOneOf2.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageStreamEventOneOf2> mapFromJson(dynamic json) {
    final map = <String, MessageStreamEventOneOf2>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageStreamEventOneOf2.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageStreamEventOneOf2-objects as value to a dart map
  static Map<String, List<MessageStreamEventOneOf2>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageStreamEventOneOf2>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageStreamEventOneOf2.listFromJson(entry.value, growable: growable,);
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


class MessageStreamEventOneOf2EventEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageStreamEventOneOf2EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodMessagePeriodDelta = MessageStreamEventOneOf2EventEnum._(r'thread.message.delta');

  /// List of all possible values in this [enum][MessageStreamEventOneOf2EventEnum].
  static const values = <MessageStreamEventOneOf2EventEnum>[
    threadPeriodMessagePeriodDelta,
  ];

  static MessageStreamEventOneOf2EventEnum? fromJson(dynamic value) => MessageStreamEventOneOf2EventEnumTypeTransformer().decode(value);

  static List<MessageStreamEventOneOf2EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageStreamEventOneOf2EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageStreamEventOneOf2EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageStreamEventOneOf2EventEnum] to String,
/// and [decode] dynamic data back to [MessageStreamEventOneOf2EventEnum].
class MessageStreamEventOneOf2EventEnumTypeTransformer {
  factory MessageStreamEventOneOf2EventEnumTypeTransformer() => _instance ??= const MessageStreamEventOneOf2EventEnumTypeTransformer._();

  const MessageStreamEventOneOf2EventEnumTypeTransformer._();

  String encode(MessageStreamEventOneOf2EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageStreamEventOneOf2EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageStreamEventOneOf2EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.message.delta': return MessageStreamEventOneOf2EventEnum.threadPeriodMessagePeriodDelta;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageStreamEventOneOf2EventEnumTypeTransformer] instance.
  static MessageStreamEventOneOf2EventEnumTypeTransformer? _instance;
}


