//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MessageDeltaContentImageUrlObjectImageUrl {
  /// Returns a new [MessageDeltaContentImageUrlObjectImageUrl] instance.
  MessageDeltaContentImageUrlObjectImageUrl({
    this.url,
    this.detail = const MessageDeltaContentImageUrlObjectImageUrlDetailEnum._('auto'),
  });

  /// The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? url;

  /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  MessageDeltaContentImageUrlObjectImageUrlDetailEnum detail;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MessageDeltaContentImageUrlObjectImageUrl &&
    other.url == url &&
    other.detail == detail;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (url == null ? 0 : url!.hashCode) +
    (detail.hashCode);

  @override
  String toString() => 'MessageDeltaContentImageUrlObjectImageUrl[url=$url, detail=$detail]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.url != null) {
      json[r'url'] = this.url;
    } else {
      json[r'url'] = null;
    }
      json[r'detail'] = this.detail;
    return json;
  }

  /// Returns a new [MessageDeltaContentImageUrlObjectImageUrl] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MessageDeltaContentImageUrlObjectImageUrl? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MessageDeltaContentImageUrlObjectImageUrl[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MessageDeltaContentImageUrlObjectImageUrl[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MessageDeltaContentImageUrlObjectImageUrl(
        url: mapValueOfType<String>(json, r'url'),
        detail: MessageDeltaContentImageUrlObjectImageUrlDetailEnum.fromJson(json[r'detail']) ?? 'auto',
      );
    }
    return null;
  }

  static List<MessageDeltaContentImageUrlObjectImageUrl> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentImageUrlObjectImageUrl>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentImageUrlObjectImageUrl.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MessageDeltaContentImageUrlObjectImageUrl> mapFromJson(dynamic json) {
    final map = <String, MessageDeltaContentImageUrlObjectImageUrl>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MessageDeltaContentImageUrlObjectImageUrl.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MessageDeltaContentImageUrlObjectImageUrl-objects as value to a dart map
  static Map<String, List<MessageDeltaContentImageUrlObjectImageUrl>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MessageDeltaContentImageUrlObjectImageUrl>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MessageDeltaContentImageUrlObjectImageUrl.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
class MessageDeltaContentImageUrlObjectImageUrlDetailEnum {
  /// Instantiate a new enum with the provided [value].
  const MessageDeltaContentImageUrlObjectImageUrlDetailEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const auto = MessageDeltaContentImageUrlObjectImageUrlDetailEnum._(r'auto');
  static const low = MessageDeltaContentImageUrlObjectImageUrlDetailEnum._(r'low');
  static const high = MessageDeltaContentImageUrlObjectImageUrlDetailEnum._(r'high');

  /// List of all possible values in this [enum][MessageDeltaContentImageUrlObjectImageUrlDetailEnum].
  static const values = <MessageDeltaContentImageUrlObjectImageUrlDetailEnum>[
    auto,
    low,
    high,
  ];

  static MessageDeltaContentImageUrlObjectImageUrlDetailEnum? fromJson(dynamic value) => MessageDeltaContentImageUrlObjectImageUrlDetailEnumTypeTransformer().decode(value);

  static List<MessageDeltaContentImageUrlObjectImageUrlDetailEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MessageDeltaContentImageUrlObjectImageUrlDetailEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MessageDeltaContentImageUrlObjectImageUrlDetailEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MessageDeltaContentImageUrlObjectImageUrlDetailEnum] to String,
/// and [decode] dynamic data back to [MessageDeltaContentImageUrlObjectImageUrlDetailEnum].
class MessageDeltaContentImageUrlObjectImageUrlDetailEnumTypeTransformer {
  factory MessageDeltaContentImageUrlObjectImageUrlDetailEnumTypeTransformer() => _instance ??= const MessageDeltaContentImageUrlObjectImageUrlDetailEnumTypeTransformer._();

  const MessageDeltaContentImageUrlObjectImageUrlDetailEnumTypeTransformer._();

  String encode(MessageDeltaContentImageUrlObjectImageUrlDetailEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MessageDeltaContentImageUrlObjectImageUrlDetailEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MessageDeltaContentImageUrlObjectImageUrlDetailEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'auto': return MessageDeltaContentImageUrlObjectImageUrlDetailEnum.auto;
        case r'low': return MessageDeltaContentImageUrlObjectImageUrlDetailEnum.low;
        case r'high': return MessageDeltaContentImageUrlObjectImageUrlDetailEnum.high;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MessageDeltaContentImageUrlObjectImageUrlDetailEnumTypeTransformer] instance.
  static MessageDeltaContentImageUrlObjectImageUrlDetailEnumTypeTransformer? _instance;
}


