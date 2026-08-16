//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageStreamEventOneOf {
  /// Returns a new [MessageStreamEventOneOf] instance.
  MessageStreamEventOneOf({
    required this.event,
    required this.data,
  });

  MessageStreamEventOneOfEventEnum event;

  MessageObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageStreamEventOneOf &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'MessageStreamEventOneOf[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [MessageStreamEventOneOf] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageStreamEventOneOf? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageStreamEventOneOf[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageStreamEventOneOf[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageStreamEventOneOf(
        event: MessageStreamEventOneOfEventEnum.fromJson(json[r'event'])!,
        data: MessageObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<MessageStreamEventOneOf> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageStreamEventOneOf>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageStreamEventOneOf.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageStreamEventOneOf> mapFromJson(dynamic json) {
    final map = <String, MessageStreamEventOneOf>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageStreamEventOneOf.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageStreamEventOneOf-objects as value to a dart map
  static Map<String, List<MessageStreamEventOneOf>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageStreamEventOneOf>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageStreamEventOneOf.listFromJson(entry.value, growable: growable,);
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


class MessageStreamEventOneOfEventEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageStreamEventOneOfEventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodMessagePeriodCreated = MessageStreamEventOneOfEventEnum._(r'thread.message.created');

  /// List of all possible values in this [enum][MessageStreamEventOneOfEventEnum].
  static const values = <MessageStreamEventOneOfEventEnum>[
    threadPeriodMessagePeriodCreated,
  ];

  static MessageStreamEventOneOfEventEnum? fromJson(dynamic value) => MessageStreamEventOneOfEventEnumTypeTransformer().decode(value);

  static List<MessageStreamEventOneOfEventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageStreamEventOneOfEventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageStreamEventOneOfEventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageStreamEventOneOfEventEnum] to String,
/// and [decode] dynamic data back to [MessageStreamEventOneOfEventEnum].
class MessageStreamEventOneOfEventEnumTypeTransformer {
  factory MessageStreamEventOneOfEventEnumTypeTransformer() => _instance ??= const MessageStreamEventOneOfEventEnumTypeTransformer._();

  const MessageStreamEventOneOfEventEnumTypeTransformer._();

  String encode(MessageStreamEventOneOfEventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageStreamEventOneOfEventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageStreamEventOneOfEventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.message.created': return MessageStreamEventOneOfEventEnum.threadPeriodMessagePeriodCreated;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageStreamEventOneOfEventEnumTypeTransformer] instance.
  static MessageStreamEventOneOfEventEnumTypeTransformer? _instance;
}


