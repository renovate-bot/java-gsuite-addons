/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/script/type/script_manifest.proto

package com.google.apps.script.type;

public final class ScriptManifest {
  private ScriptManifest() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_CommonAddOnManifest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_CommonAddOnManifest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_LayoutProperties_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_LayoutProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_HttpOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_HttpOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/apps/script/type/script_manifes"
          + "t.proto\022\027google.apps.script.type\032.google"
          + "/apps/script/type/addon_widget_set.proto"
          + "\032-google/apps/script/type/extension_poin"
          + "t.proto\032\034google/protobuf/struct.proto\"\266\003"
          + "\n\023CommonAddOnManifest\022\014\n\004name\030\001 \001(\t\022\020\n\010l"
          + "ogo_url\030\002 \001(\t\022D\n\021layout_properties\030\003 \001(\013"
          + "2).google.apps.script.type.LayoutPropert"
          + "ies\022B\n\021add_on_widget_set\030\004 \001(\0132\'.google."
          + "apps.script.type.AddOnWidgetSet\022\033\n\023use_l"
          + "ocale_from_app\030\005 \001(\010\022I\n\020homepage_trigger"
          + "\030\006 \001(\0132/.google.apps.script.type.Homepag"
          + "eExtensionPoint\022Q\n\021universal_actions\030\007 \003"
          + "(\01326.google.apps.script.type.UniversalAc"
          + "tionExtensionPoint\022:\n\026open_link_url_pref"
          + "ixes\030\010 \001(\0132\032.google.protobuf.ListValue\"B"
          + "\n\020LayoutProperties\022\025\n\rprimary_color\030\001 \001("
          + "\t\022\027\n\017secondary_color\030\002 \001(\t\"]\n\013HttpOption"
          + "s\022N\n\024authorization_header\030\001 \001(\01620.google"
          + ".apps.script.type.HttpAuthorizationHeade"
          + "r*v\n\027HttpAuthorizationHeader\022)\n%HTTP_AUT"
          + "HORIZATION_HEADER_UNSPECIFIED\020\000\022\023\n\017SYSTE"
          + "M_ID_TOKEN\020\001\022\021\n\rUSER_ID_TOKEN\020\002\022\010\n\004NONE\020"
          + "\003B\250\001\n\033com.google.apps.script.typeP\001Z6goo"
          + "gle.golang.org/genproto/googleapis/apps/"
          + "script/type\252\002\027Google.Apps.Script.Type\312\002\027"
          + "Google\\Apps\\Script\\Type\352\002\032Google::Apps::"
          + "Script::Typeb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              AddonWidgetSetExtension.getDescriptor(),
              com.google.apps.script.type.ExtensionPoint.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_apps_script_type_CommonAddOnManifest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_apps_script_type_CommonAddOnManifest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_CommonAddOnManifest_descriptor,
            new java.lang.String[] {
              "Name",
              "LogoUrl",
              "LayoutProperties",
              "AddOnWidgetSet",
              "UseLocaleFromApp",
              "HomepageTrigger",
              "UniversalActions",
              "OpenLinkUrlPrefixes",
            });
    internal_static_google_apps_script_type_LayoutProperties_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_apps_script_type_LayoutProperties_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_LayoutProperties_descriptor,
            new java.lang.String[] {
              "PrimaryColor", "SecondaryColor",
            });
    internal_static_google_apps_script_type_HttpOptions_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_apps_script_type_HttpOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_HttpOptions_descriptor,
            new java.lang.String[] {
              "AuthorizationHeader",
            });
    AddonWidgetSetExtension.getDescriptor();
    com.google.apps.script.type.ExtensionPoint.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
