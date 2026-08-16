//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PredictionContent {
  /// Returns a new [PredictionContent] instance.
  PredictionContent({
    required this.type,
    required this.content,
  });

  /// The type of the predicted content you want to provide. This type is currently always `content`. 
  PredictionContentTypeEnum type;

  PredictionContentContent content;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PredictionContent &&
    other.type == type &&
    other.content == content;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (content.hashCode);

  @override
  String toString() => 'PredictionContent[type=$type, content=$content]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'content'] = this.content;
    return json;
  }

  /// Returns a new [PredictionContent] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PredictionContent? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PredictionContent[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PredictionContent[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PredictionContent(
        type: PredictionContentTypeEnum.fromJson(json[r'type'])!,
        content: PredictionContentContent.fromJson(json[r'content'])!,
      );
    }
    return null;
  }

  static List<PredictionContent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PredictionContent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PredictionContent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PredictionContent> mapFromJson(dynamic json) {
    final map = <String, PredictionContent>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PredictionContent.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PredictionContent-objects as value to a dart map
  static Map<String, List<PredictionContent>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PredictionContent>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PredictionContent.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'content',
  };
}

/// The type of the predicted content you want to provide. This type is currently always `content`. 
class PredictionContentTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const PredictionContentTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const content = PredictionContentTypeEnum._(r'content');

  /// List of all possible values in this [enum][PredictionContentTypeEnum].
  static const values = <PredictionContentTypeEnum>[
    content,
  ];

  static PredictionContentTypeEnum? fromJson(dynamic value) => PredictionContentTypeEnumTypeTransformer().decode(value);

  static List<PredictionContentTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PredictionContentTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PredictionContentTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PredictionContentTypeEnum] to String,
/// and [decode] dynamic data back to [PredictionContentTypeEnum].
class PredictionContentTypeEnumTypeTransformer {
  factory PredictionContentTypeEnumTypeTransformer() => _instance ??= const PredictionContentTypeEnumTypeTransformer._();

  const PredictionContentTypeEnumTypeTransformer._();

  String encode(PredictionContentTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PredictionContentTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PredictionContentTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'content': return PredictionContentTypeEnum.content;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PredictionContentTypeEnumTypeTransformer] instance.
  static PredictionContentTypeEnumTypeTransformer? _instance;
}


