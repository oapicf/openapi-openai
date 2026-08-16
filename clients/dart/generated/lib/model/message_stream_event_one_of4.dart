//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageStreamEventOneOf4 {
  /// Returns a new [MessageStreamEventOneOf4] instance.
  MessageStreamEventOneOf4({
    required this.event,
    required this.data,
  });

  MessageStreamEventOneOf4EventEnum event;

  MessageObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageStreamEventOneOf4 &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'MessageStreamEventOneOf4[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [MessageStreamEventOneOf4] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageStreamEventOneOf4? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageStreamEventOneOf4[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageStreamEventOneOf4[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageStreamEventOneOf4(
        event: MessageStreamEventOneOf4EventEnum.fromJson(json[r'event'])!,
        data: MessageObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<MessageStreamEventOneOf4> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageStreamEventOneOf4>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageStreamEventOneOf4.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageStreamEventOneOf4> mapFromJson(dynamic json) {
    final map = <String, MessageStreamEventOneOf4>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageStreamEventOneOf4.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageStreamEventOneOf4-objects as value to a dart map
  static Map<String, List<MessageStreamEventOneOf4>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageStreamEventOneOf4>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageStreamEventOneOf4.listFromJson(entry.value, growable: growable,);
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


class MessageStreamEventOneOf4EventEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageStreamEventOneOf4EventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodMessagePeriodIncomplete = MessageStreamEventOneOf4EventEnum._(r'thread.message.incomplete');

  /// List of all possible values in this [enum][MessageStreamEventOneOf4EventEnum].
  static const values = <MessageStreamEventOneOf4EventEnum>[
    threadPeriodMessagePeriodIncomplete,
  ];

  static MessageStreamEventOneOf4EventEnum? fromJson(dynamic value) => MessageStreamEventOneOf4EventEnumTypeTransformer().decode(value);

  static List<MessageStreamEventOneOf4EventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageStreamEventOneOf4EventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageStreamEventOneOf4EventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageStreamEventOneOf4EventEnum] to String,
/// and [decode] dynamic data back to [MessageStreamEventOneOf4EventEnum].
class MessageStreamEventOneOf4EventEnumTypeTransformer {
  factory MessageStreamEventOneOf4EventEnumTypeTransformer() => _instance ??= const MessageStreamEventOneOf4EventEnumTypeTransformer._();

  const MessageStreamEventOneOf4EventEnumTypeTransformer._();

  String encode(MessageStreamEventOneOf4EventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageStreamEventOneOf4EventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageStreamEventOneOf4EventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.message.incomplete': return MessageStreamEventOneOf4EventEnum.threadPeriodMessagePeriodIncomplete;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageStreamEventOneOf4EventEnumTypeTransformer] instance.
  static MessageStreamEventOneOf4EventEnumTypeTransformer? _instance;
}


